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
 * AccountType entity maps to the account type table with defined properties
 * 
 * @author Vinothpandian P
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountType {
	
	@Id
	private int accountTypeId;
	
	@Size(max = 100)
	@NonNull
	private String accountTypeName;

}
