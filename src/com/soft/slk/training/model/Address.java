package com.soft.slk.training.model;

public class Address {
	private String addressLineOne;
	private String addressLineTwo;
	private String city;
	private String zip;
	private String state;
	private String country;
	private boolean internationAddress;
	private boolean specialMailingAddress;
	
	public String getAddressLineOne() {
		return addressLineOne;
	}
	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}
	public String getAddressLineTwo() {
		return addressLineTwo;
	}
	public void setAddressLineTwo(String addressLineTwo) {
		this.addressLineTwo = addressLineTwo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public boolean isInternationAddress() {
		return internationAddress;
	}
	public void setInternationAddress(boolean internationAddress) {
		this.internationAddress = internationAddress;
	}
	public boolean isSpecialMailingAddress() {
		return specialMailingAddress;
	}
	public void setSpecialMailingAddress(boolean specialMailingAddress) {
		this.specialMailingAddress = specialMailingAddress;
	}
}
