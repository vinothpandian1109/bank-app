package com.bank.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

/*** 
 * Customer entity maps to the customer table with defined properties
 * 
 * @author Vinothpandian P
 */

@Entity
@Data
public class Customer {
	
	@Id
	@GeneratedValue
	private long customerId;
	private String cusomerName;

}
