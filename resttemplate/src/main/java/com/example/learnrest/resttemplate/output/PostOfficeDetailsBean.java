package com.example.learnrest.resttemplate.output;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostOfficeDetailsBean {
	
	
	
	public PostOfficeDetailsBean() {
		super();
	}

	
	private String Name;	
	private String Description;
	private String BranchType;
	private String DeliveryStatus;
	private String Circle;
	private String District;
	private String Division;
	private String Region;
	private String State;
	private String Country;
	private String Pincode;
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		this.Name = name;
	}
	
	public String getDescription() {
		return Description;
	}
	
	public void setDescription(String description) {
		Description = description;
	}
	
	public String getBranchType() {
		return BranchType;
	}
	
	public void setBranchType(String branchType) {
		BranchType = branchType;
	}
	
	public String getDeliveyStatus() {
		return DeliveryStatus;
	}
	
	public void setDeliveyStatus(String deliveyStatus) {
		DeliveryStatus = deliveyStatus;
	}
	
	public String getCircle() {
		return Circle;
	}
	
	public void setCircle(String circle) {
		Circle = circle;
	}
	
	public String getDistrict() {
		return District;
	}
	
	public void setDistrict(String district) {
		District = district;
	}
	
	public String getDivision() {
		return Division;
	}
	
	public void setDivision(String division) {
		Division = division;
	}
	
	public String getRegion() {
		return Region;
	}
	
	public void setRegion(String region) {
		Region = region;
	}
	
	public String getState() {
		return State;
	}
	
	public void setState(String state) {
		State = state;
	}
	
	public String getCountry() {
		return Country;
	}
	
	public void setCountry(String country) {
		Country = country;
	}
	
	public String getPincode() {
		return Pincode;
	}
	
	public void setPincode(String pincode) {
		Pincode = pincode;
	}

	@Override
	public String toString() {
		return "PostOfficeDetailsBean [name=" + Name + ", Description=" + Description + ", BranchType=" + BranchType
				+ ", DeliveyStatus=" + DeliveryStatus + ", Circle=" + Circle + ", District=" + District + ", Division="
				+ Division + ", Region=" + Region + ", State=" + State + ", Country=" + Country + ", Pincode=" + Pincode
				+ "]";
	}

}
