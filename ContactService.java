package com.contactservice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



/**
 * @author Sergio H. Passos
 * @version 1.0
 * 
 * ContactService class
 *      This singleton class has the ability to manage contacts.
 *      Such as adding a contact with a unique id,
 *      delete contacts with contact id,
 *      and update contact fields such as first name, last name, phone number, and address
 * 
 * */
public class ContactService {

	/**
	 * holds all contacts
	 * */
	private List<Contact> contacts = new ArrayList<Contact>();
	
	/**
	 * single instance
	 * */
	private static ContactService instance = new ContactService();
	
	
	/**
	 * constructor
	 * */
	private ContactService() {}
	
	/**
	 * returns the single instance
	 * 
	 * @return the single instance
	 * */
	public static ContactService getInstance() {
		return instance;
	}
	
	/**
	 * create new contact and add to list
	 * 
	 * @param firstName, lastName, phone, address
	 * @return the newly added or found contact
	 * */
	public Contact addContact(String firstName, String lastName, String phone, String address) {
		// create a new contact
		Contact newContact = null;
		
		// create an Iterator 
		Iterator<Contact> iterator = this.contacts.iterator();
		
		// traverse the iterator and look for an existing contact with the same name
		while(iterator.hasNext()) 
		{
			// get the next contact on the list
			Contact tmp = iterator.next();
			
			// if name already exists
			if(tmp.getFirstName().equalsIgnoreCase(firstName) && tmp.getLastName().equalsIgnoreCase(lastName)) 
			{
				// return existing contact
				return tmp;
			}
		}
		

		// if not found, make a new contact instance and add to list of contacts
		if (newContact == null) {
			newContact = new Contact(Integer.toString(this.contacts.size()) , firstName, lastName, phone, address);
			contacts.add(newContact);
		}

		// return the new contact instance
		return newContact;
				
	}
	
	/**
	 * delete contact with unique id
	 * 
	 * @param id
	 * */
	public boolean deleteContact(String id) {
		// create an Iterator 
		Iterator<Contact> iterator = this.contacts.iterator();
		
		// traverse the iterator and look for an existing contact with the same name
		while(iterator.hasNext()) 
		{
			// get the next contact on the list
			Contact tmp = iterator.next();
			
			// if id matches, than delete contact
			if(tmp.getId().equalsIgnoreCase(id)) 
			{
				// delete contact
				this.contacts.remove(tmp);
				
				// exit loop
				return true;
			}
		}
		
		// no contact deleted
		return false;
	}
	
	/**
	 * update contact first name
	 * 
	 * @param contact id, firstName
	 * */
	public Contact updateFirstName(String id, String firstName) {
		// find contact
		Contact contact = this.findContact(id);
		
		// update contact if not null
		if(contact != null) {
			contact.setFirstName(firstName);
		}
		
		// return
		return contact;
	}
	
	/**
	 * update contact last name
	 * 
	 * @param contact id, lastName
	 * */
	public Contact updateLastName(String id, String lastName) {
		// find contact
		Contact contact = this.findContact(id);
		
		// update contact if not null
		if(contact != null) {
			contact.setLastName(lastName);
		}
		
		// return
		return contact;
	}
	
	/**
	 * update contact phone
	 * 
	 * @param contact id, phone
	 * */
	public Contact updatePhone(String id, String phone) {
		// find contact
		Contact contact = this.findContact(id);
		
		// update contact if not null
		if(contact != null) {
			contact.setPhone(phone);
		}
		
		// return
		return contact;
	}
	
	/**
	 * update contact address
	 * 
	 * @param contact id, address
	 * */
	public Contact updateAddress(String id, String address) {
		// find contact
		Contact contact = this.findContact(id);
		
		// update contact if not null
		if(contact != null) {
			contact.setAddress(address);
		}
		
		// return
		return contact;
	}
	
	/**
	 * find contact with id
	 * 
	 * @param id
	 * @return Contact
	 * */
	private Contact findContact(String id) {
		// contact container
		Contact contact = null;
		
		// create an Iterator 
		Iterator<Contact> iterator = this.contacts.iterator();
		
		// traverse the iterator and look for an existing contact with the same name
		while(iterator.hasNext()) 
		{
			// get the next contact on the list
			Contact tmpContact = iterator.next();
			
			// find contact
			if(tmpContact.getId().equalsIgnoreCase(id)) 
			{
				// return existing contact
				return tmpContact;
			}
		}
		
		//return empty contact
		return contact;
	}
	
}
