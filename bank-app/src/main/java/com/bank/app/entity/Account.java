package com.bank.app.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Account {
	
	@Id
	@GeneratedValue
    private UUID id;
	private String name;

}
