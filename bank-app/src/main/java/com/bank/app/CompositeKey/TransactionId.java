package com.bank.app.CompositeKey;

import java.io.Serializable;

import com.bank.app.entity.Account;

/*** 
 * TransactionId is a composite key class to be linked with Transaction
 * 
 * @author Vinothpandian P
 *
 */

public class TransactionId implements Serializable{
	
	private Account account; 

}
