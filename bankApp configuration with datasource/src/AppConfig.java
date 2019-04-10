package com.capgemini.bank.config;
import com.capgemini.bank.dao.impl.*;
import com.capgemini.bank.service.impl.*;
import com.capgemini.bank.util.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import java.io.*;
import java.sql.*;
import java.util.*;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;

@Configuration
public class AppConfig{
	
	@Bean
	public DataSource dataSource(){

		DriverManagerDataSource ds = new DriverManagerDataSource();

		ds.setDriverManager("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/bankappdb");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;

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