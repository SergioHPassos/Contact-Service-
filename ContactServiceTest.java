package com.contactserviceTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.contactservice.ContactService;

class ContactServiceTest {
	
	/**
	 * The contact service shall be able to add contacts with a unique ID.
	 * */
	@Test
	void testContactServiceAddContact() {
		ContactService contactService = ContactService.getInstance();
		assertTrue(contactService.addContact("Sergio", "Passos", "9034253451", "555DanDrive,Buckville,TN,51689").getLastName().equalsIgnoreCase("passos"));
		
	}
	
	/**
	 * The contact service shall be able to delete contacts per contact ID.
	 * */
	@Test
	void testContactServiceDeleteContact() {
		ContactService contactService = ContactService.getInstance();
		assertTrue(contactService.addContact("Sergio", "Passos", "9034253451", "555DanDrive,Buckville,TN,51689").getLastName().equalsIgnoreCase("passos"));
		assertTrue(contactService.deleteContact("0"));
		
	}

	/**
	 * The contact service shall be able to update contact fields per contact ID.
	 * */
	@Test
	void testContactServiceUpdateContact() {
		ContactService contactService = ContactService.getInstance();
		assertTrue(contactService.addContact("Sergio", "Passos", "9034253451", "555DanDrive,Buckville,TN,51689").getLastName().equalsIgnoreCase("passos"));
		assertTrue(contactService.updateFirstName("0", "Tom").getFirstName().equalsIgnoreCase("Tom"));
		assertTrue(contactService.updateLastName("0", "Bloom").getLastName().equalsIgnoreCase("Bloom"));
		assertTrue(contactService.updatePhone("0", "5623466185").getPhone().equalsIgnoreCase("5623466185"));
		assertTrue(contactService.updateAddress("0", "43 Flip, Ankle, NY, 26485").getAddress().equalsIgnoreCase("43 Flip, Ankle, NY, 26485"));
		
	}

}
