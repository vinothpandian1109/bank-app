package com.bank.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

/*** 
 * AccountType entity maps to the account type table with defined properties
 * 
 * @author Vinothpandian P
 */

@Entity
@Data
public class AccountType {
	
	@Id
	private int accountTypeId;
	private String accountTypeName;

}
