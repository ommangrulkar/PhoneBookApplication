package com.BikkadIT.PhoneBook.PhoneBookRepository;

import java.io.Serializable;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.PhoneBook.PhoneBookModel.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Serializable>{

}
