package com.abc.cntr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abc.model.Contact;
import com.abc.service.ContactService;

@RestController
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@PostMapping(value = {"/contact"}) 
	public String contactAdd(@RequestBody Contact contact) {
		contactService.add(contact);
		return "success";
	}
	
	@PutMapping(value = {"/contact"})
	public String contactUpdate(@RequestBody Contact contact) {
		contactService.modify(contact);
		return "success";
	}
	
}
