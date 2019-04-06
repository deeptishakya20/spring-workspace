package com.capgemini.spring.organization;
import com.capgemini.spring.organization.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.*; 
import java.io.*;


@Configuration
public class AppConfig {
	
	private Organization org;	

	public Address getAddress(){
		Address address = new Address("AshokNagar","Bhopal","NA");

		return address;
	}

	public List<String> getDirectors(){
		List<String> directors = new ArrayList<>();
 		directors.add("John");
		directors.add("Jane");
		return directors;
	}

	public Set<String> getBranches(){
		Set<String> branches = new HashSet<>();
 		branches.add("California");
		branches.add("Sydney");
		return branches;
	}

	public Map<String,String> getBranchWiseHead(){
		Map<String,String> branchWiseHead = new HashMap<>();
 		branchWiseHead.put("California","Mark");
		branchWiseHead.put("Sydney","Joe");
		return branchWiseHead;
	}

	public Properties getIpAddresses(){
		Properties ipAddress = new Properties();
		ipAddress.put("California", "11.673.892.9883");
		ipAddress.put("Sydney", "6762.637.43.2414");
		return ipAddress;
	}
	public Properties getDatabaseDetails(){
		Properties databaseDetails = new Properties();
		FileReader reader = null;
		try {

			reader = new FileReader("src/dbconfig.properties");
			databaseDetails.load(reader);
	
		} 
		catch (IOException ex) {
			ex.printStackTrace();
		} 
		return databaseDetails;
	}

		

	@Bean("organization")
	public Organization organization(){
		Organization organization = new Organization();
		organization.setOrgId(101);
		organization.setOrgName("amazon");
		organization.setMarketPrice(7000000);
		organization.setAddress(getAddress());
		organization.setDirectors(getDirectors());
		organization.setBranches(getBranches());
		organization.setBranchWiseHead(getBranchWiseHead());
		organization.setIpAddresses(getIpAddresses());
		organization.setDatabaseDetails(getDatabaseDetails());
		return organization;
	}
}