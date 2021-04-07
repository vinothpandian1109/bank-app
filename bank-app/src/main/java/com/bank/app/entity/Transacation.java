package com.bank.app.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

import com.bank.app.CompositeKey.TransactionId;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*** 
 * Transacation entity maps to the Transacation table with defined properties
 * 
 * @author Vinothpandian P
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@IdClass(TransactionId.class)
public class Transacation {
	
	@Id
	private String referenceNo;
	
	@Id
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "accountNo", referencedColumnName = "accountNo")
    private Account account;
	
	@NonNull
	private double transactionAmount;
	
	@NonNull
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "transactionTypeId", referencedColumnName = "transactionTypeId")
	private TransacationType transactionType;
	
	@NonNull
	private Date transactionDate;
	
	@Size(max = 200)
	private String transactionReason;
	
	@Size(max = 500)
	private String comments;

}
