package com.BikkadIT.PhoneBook.PhoneBookModel;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class Contact {
	
	private Integer contactId;
	private String contactName;
	private String contactNumber;
	private String contactEmail;
	private Character activeSwitch;
	private LocalDate createdDate;
	private LocalDate  updateDate;
	
	


}
