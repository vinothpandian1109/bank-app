package com.bank.app.CompositeKey;

import java.io.Serializable;

import com.bank.app.entity.Customer;


/*** 
 * CustomerId is a composite key class to be linked with accounts
 * 
 * @author Vinothpandian P
 *
 */

public class CustomerId implements Serializable{
	
	private Customer customer; 

}
