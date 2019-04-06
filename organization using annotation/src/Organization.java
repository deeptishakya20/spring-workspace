package com.capgemini.spring.organization;
import com.capgemini.spring.organization.*;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import javax.annotation.Resource;



@Component
public class Organization{
	
	@Value("101")
	private int orgId;

	@Value("Amazon")
	private String orgName;

	@Value("70000000")
	private double marketPrice;

	@Autowired
	private Address address;

	@Resource(name = "directors")
	private List<String> directors;

	@Resource(name = "branches")
	private Set<String> branches;

	@Resource(name = "branchWiseHead")
	private Map<String, String> branchWiseHead;

	@Resource(name = "ipAddresses")
	private Properties ipAddresses;

	@Resource(name = "databaseDetails")
	private Properties databaseDetails;

	
	
	
	public int getOrgId() {
		//System.out.println("Organization Id :"  + orgId);
		return orgId;
	}

	
	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		//System.out.println("Organization Name :"  + orgName);
		return orgName;
	}

	
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public double getMarketPrice() {
		//System.out.println("Market Price :"  + marketPrice);
		return marketPrice;
	}

	
	public void setMarketPrice(double marketPrice) {
		this.marketPrice = marketPrice;
	}
	public Address getAddress() {
		//System.out.println("Address :"  + address);
		return address;
	}

	
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<String> getDirectors() {
		//System.out.println("Directors :"  + directors);
		return directors;
	}

	
	public void setDirectors(List<String> directors) {
		this.directors = directors;
	}
	public Set<String> getBranches() {
		//System.out.println("Branches :"  + branches);
		return branches;
	}

	
	public void setBranches(Set<String> branches) {
		this.branches = branches;
	}
	public Map<String, String> getBranchWiseHead() {
		//System.out.println("BranchWiseHead :"  + branchWiseHead);
		return branchWiseHead;
	}

	
	public void setBranchWiseHead(Map<String, String> branchWiseHead) {
		this.branchWiseHead = branchWiseHead;
	}
	public Properties getIpAddresses() {
		//System.out.println("Ip address :"  + ipAddresses);
		return ipAddresses;
	}

	
	public void setIpAddresses(Properties ipAddresses) {
		this.ipAddresses = ipAddresses;
	}
	public Properties getDatabaseDetails() {
		//System.out.println("Database Details :"  + databaseDetails);
		return databaseDetails;
	}

	
	public void setDatabaseDetails(Properties databaseDetails) {
		this.databaseDetails = databaseDetails;
	}
	
	@Override
	public String toString() {
		return ("Organization Id :"  + orgId +"\n"+ "Organization Name :"  + orgName +"\n"+ "Market Price :"  + marketPrice +"\n"+
			"Address :"  + address +"\n"+ "Directors :"  + directors +"\n"+ "Branches :"  + branches +"\n"+ "BranchWiseHead :"
			 + branchWiseHead +"\n"+ "Ip address :"  + ipAddresses +"\n"+ "Database Details :"  + databaseDetails);
 	}


}