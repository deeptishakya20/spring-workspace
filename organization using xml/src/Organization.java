package com.capgemini.spring.organization;
import com.capgemini.spring.organization.*;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Organization{
	
	private int orgId;
	private String orgName;
	private double marketPrice;
	private Address address;
	private List<String> directors;
	private Set<String> branches;
	private Map<String, String> branchWiseHead;
	private Properties ipAddresses;
	private Properties databaseDetails;

	public Organization() {

		super();
	}
	
	public Organization(int orgId, String orgName, double marketPrice, Address address, List<String> directors,
			Set<String> branches, Map<String, String> branchWiseHead, Properties ipAddresses,
			Properties databaseDetails) {
		super();
		this.orgId = orgId;
		this.orgName = orgName;
		this.marketPrice = marketPrice;
		this.address = address;
		this.directors = directors;
		this.branches = branches;
		this.branchWiseHead = branchWiseHead;
		this.ipAddresses = ipAddresses;
		this.databaseDetails = databaseDetails;
	}

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