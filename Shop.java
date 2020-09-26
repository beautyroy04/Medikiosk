package com.mongodb.madicalshop.model;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Shop {
	
	@Id
	private int id;
	private String name;
	private long Contact;
	private List<Medicine> medicine;
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Medicine> getMedicine() {
		return medicine;
	}
	public void setMedicine(List<Medicine> medicine) {
		this.medicine = medicine;
	}
	public long getContact() {
		return Contact;
	}
	public void setContact(long contact) {
		Contact = contact;
	}
	}

