package com.abc.service;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.dao.ContactDao;
import com.abc.model.Contact;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactDao contactDao;

	@Override
	public void add(Contact contact) {
		contactDao.save(contact);
	}

	@Override
	public void modify(Contact contact) {
		contactDao.save(contact);
	}

}
