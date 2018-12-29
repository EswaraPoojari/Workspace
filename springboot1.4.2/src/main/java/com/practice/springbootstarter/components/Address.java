package com.practice.springbootstarter.components;

import javax.validation.constraints.Pattern;

public class Address {

	private String Country;
	private String state;
	private String city;
	private String Strret;
	@Pattern(regexp="\\d{6}")
	private String zipCode;
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStrret() {
		return Strret;
	}
	public void setStrret(String strret) {
		Strret = strret;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "Address [Country=" + Country + ", state=" + state + ", city=" + city + ", Strret=" + Strret
				+ ", zipCode=" + zipCode + "]";
	}
	
}
