package com.contactservice;

/**
 * @author Sergio H. Passos
 * @version 1.0
 * 
 * Contact class
 *      This class holds information for a contact
 * 
 * */
public class Contact {
	
	/**
	 * instance variables
	 * */
	private String id;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	
	/**
	 * constructor
	 * 
	 * @param contact id, first name, last name, phone, and address
	 * */
	public Contact(String id, String firstName, String lastName, String phone, String address) {
		// check for null or length greater than 10
		if(id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		
		// check for null or length greater than 10
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		
		// check for null or length greater than 10
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		
		// check for null or length is exactly 10 digits
		if(phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		
		// check for null or length greater than 30
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		
		// assign
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	
	/**
	 * get id
	 * 
	 * @return id
	 * */
	public String getId() {
		return this.id;
	}
	
	/**
	 * get first name
	 * 
	 * @return firstName
	 * */
	public String getFirstName() {
		return this.firstName;
	}
	
	/**
	 * get last name
	 * 
	 * @return lastName
	 * */
	public String getLastName() {
		return this.lastName;
	}
	
	/**
	 * get phone
	 * 
	 * @return phone
	 * */
	public String getPhone() {
		return this.phone;
	}
	
	/**
	 * get address
	 * 
	 * @return address
	 * */
	public String getAddress() {
		return this.address;
	}
	
	/**
	 * set first name
	 * 
	 * @param first name
	 * */
	public void setFirstName(String firstName) {
		// check for null or length greater than 10
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		
		// update
		this.firstName = firstName;
	}
	
	/**
	 * set last name
	 * 
	 * @param last name
	 * */
	public void setLastName(String lastName) {
		// check for null or length greater than 10
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		
		//update
		this.lastName = lastName;
	}
	
	/**
	 * set phone number
	 * 
	 * @param phone number
	 * */
	public void setPhone(String phone) {
		// check for null or length is exactly 10 digits
		if(phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		
		//update
		this.phone = phone;
	}
	
	/**
	 * set address
	 * 
	 * @param address
	 * */
	public void setAddress(String address) {
		// check for null or length greater than 30
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		
		//update
		this.address = address;
	}

}
