package com.bank.app.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.lang.NonNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*** 
 * Account entity maps to the account table with defined properties
 * 
 * @author Vinothpandian P
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Account {
	
	@Id
	@GeneratedValue
    private long accountNo;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customerId", referencedColumnName = "customerId")
	private Customer customer;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "accountTypeId", referencedColumnName = "accountTypeId")
	private AccountType accountType;
	
	@NonNull
	private double balance;

}
