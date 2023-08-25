package com.abc.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class PhoneNumber {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String number;

	    @ManyToOne
	    @JoinColumn(name = "contact_id")
	    private Contact contact;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNumber() {
			return number;
		}

		public void setNumber(String number) {
			this.number = number;
		}

		public Contact getContact() {
			return contact;
		}

		public void setContact(Contact contact) {
			this.contact = contact;
		}

		@Override
		public String toString() {
			return "PhoneNumber [id=" + id + ", number=" + number + ", contact=" + contact + "]";
		}
	    
	    

}

