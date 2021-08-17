package com.contactserviceTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.contactservice.Contact;

class ContactTest {

	/**
	 * The contact object shall have a required unique contact ID string that cannot be longer than 10 characters. The contact ID shall not be null and shall not be updatable.
	 * */
	@Test
	void testContactIdError() {
		// test length over 10
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("012345678912334234234", "Sergio", "Passos", "8251644592", "555DanDrive,Buckville,TN,51689");
		});
		
		// test null
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Sergio", "Passos", "8251644592", "555DanDrive,Buckville,TN,51689");
		});
		
	}
	
	/**
	 * The contact object shall have a required firstName String field that cannot be longer than 10 characters. The firstName field shall not be null.
	 * */
	@Test
	void testContactFirstNameError() {
		// test length over 10
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0", "Sergioooooo", "Passos", "8251644592", "555DanDrive,Buckville,TN,51689");
		});
		
		// test null
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", null, "Passos", "8251644592", "555DanDrive,Buckville,TN,51689");
		});
	}
	
	/**
	 * The contact object shall have a required lastName String field that cannot be longer than 10 characters. The lastName field shall not be null.
	 * */
	@Test
	void testContactLastNameError() {
		// test length over 10
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0", "Sergio", "Passosqqqqqqq", "8251644592", "555DanDrive,Buckville,TN,51689");
		});
		
		// test null
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Sergio", null, "8251644592", "555DanDrive,Buckville,TN,51689");
		});
	}
	
	/**
	 * The contact object shall have a required phone String field that must be exactly 10 digits. The phone field shall not be null.
	 * */
	@Test
	void testContactPhoneError() {
		// test length over 10
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0", "Sergio", "Passos", "902347161888866666", "555DanDrive,Buckville,TN,51689");
		});
		
		// test null
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Sergio", "Passos", null, "555DanDrive,Buckville,TN,51689");
		});
	}
	
	/**
	 * The contact object shall have a required address field that must be no longer than 30 characters. The address field shall not be null.
	 * */
	@Test
	void testContactAddressError() {
		// test length over 10
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0", "Sergioooooo", "Passos", "8251644592", "555DanDrive,Buckville,TN,51689, qwqwqwqwqwqw");
		});
		
		// test null
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Sergio", "Passos", "8251644592", null);
		});
	}
}
