package com.bank.app.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.bank.app.CompositeKey.CustomerId;

import lombok.Data;

/*** 
 * Account entity maps to the account table with defined properties
 * 
 * @author Vinothpandian P
 */

@Entity
@Data
@IdClass(CustomerId.class)
public class Account {
	
	@Id
	@GeneratedValue
    private long accountNo;
	@Id
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customerId", referencedColumnName = "customerId")
	private Customer customer;
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "accountTypeId", referencedColumnName = "accountTypeId")
	private AccountType accountType;
	private double balance;

}
