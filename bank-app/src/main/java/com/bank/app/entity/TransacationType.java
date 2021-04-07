package com.bank.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*** 
 * TransacationType entity maps to the Transacation type table with defined properties
 * 
 * @author Vinothpandian P
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransacationType {
	
	@Id
	private int transactionTypeId;
	
	@Size(max = 100)
	@NonNull
	private String transactionName;

}
