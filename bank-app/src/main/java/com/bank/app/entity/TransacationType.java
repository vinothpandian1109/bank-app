package com.bank.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

/*** 
 * TransacationType entity maps to the Transacation type table with defined properties
 * 
 * @author Vinothpandian P
 */

@Entity
@Data
public class TransacationType {
	
	@Id
	private int transactionId;
	private String transactionName;

}
