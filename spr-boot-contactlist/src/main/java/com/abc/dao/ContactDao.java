package com.abc.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.abc.model.Contact;


@Repository
public interface ContactDao extends JpaRepository<Contact, Integer> {
	
}
