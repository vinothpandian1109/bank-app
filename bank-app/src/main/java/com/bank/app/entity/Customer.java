package com.bank.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*** 
 * Customer entity maps to the customer table with defined properties
 * 
 * @author Vinothpandian P
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer {
	
	@Id
	@GeneratedValue
	private long customerId;
	
	@Size(max = 100)
	private String customerName;

}
