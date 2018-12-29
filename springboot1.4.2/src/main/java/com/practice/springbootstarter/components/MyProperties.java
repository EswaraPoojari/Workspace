package com.practice.springbootstarter.components;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@ConfigurationProperties("app")
@Validated // To activate validation
public class MyProperties {

	private Map<String, String> map = new HashMap<>();
	private List<String> adminEmails;
    private boolean sendEmailOnErrors;
    // Custom conversion is created for this
    private LocalDate tradeStartDate;
	@Pattern(regexp="(0|[+]91-)?[7-9]\\d{9}")
    private String contactNumber;
    // To validate nested (cascaded) configuration properties use @Valid
    @Valid
    private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public List<String> getAdminEmails() {
		return adminEmails;
	}

	public void setAdminEmails(List<String> adminEmails) {
		this.adminEmails = adminEmails;
	}

	public boolean isSendEmailOnErrors() {
		return sendEmailOnErrors;
	}

	public void setSendEmailOnErrors(boolean sendEmailOnErrors) {
		this.sendEmailOnErrors = sendEmailOnErrors;
	}

	public LocalDate getTradeStartDate() {
		return tradeStartDate;
	}

	public void setTradeStartDate(LocalDate tradeStartDate) {
		this.tradeStartDate = tradeStartDate;
	}
	@Override
	public String toString() {
		return "MyProperties [map=" + map + ", adminEmails=" + adminEmails + ", sendEmailOnErrors=" + sendEmailOnErrors
				+ ", tradeStartDate=" + tradeStartDate + ", contactNumber=" + contactNumber + ", address=" + address
				+ "]";
	}
}
