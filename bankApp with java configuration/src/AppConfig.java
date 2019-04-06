package com.capgemini.bank.config;
import com.capgemini.bank.dao.impl.*;
import com.capgemini.bank.service.impl.*;
import com.capgemini.bank.util.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import java.io.*;
import java.sql.*;
import java.util.*;


@Configuration
public class AppConfig{

	public Properties getProperties(){
		Properties properties=null;

		try {
			File propertiesFile = new File("src/dbConfig.properties");
			FileReader fileReader = new FileReader(propertiesFile);

			properties = new Properties();
			properties.load(fileReader);
		} catch (IOException e) {

			e.printStackTrace();
		}
		return properties;
	}

	public Connection getConnection(){
		Connection connection = DbUtil.getconnection(getProperties());
		return connection;
	}

	public BankAccountDaoImpl getBankAccountDaoImpl(){
		BankAccountDaoImpl bankAccountDao = new BankAccountDaoImpl(getConnection());
		return bankAccountDao;
	}

	@Bean
	public BankAccountServiceImpl getBankAccountServiceImpl(){
		BankAccountServiceImpl bankAccountService = new BankAccountServiceImpl(getBankAccountDaoImpl());
		return bankAccountService;
	}
}