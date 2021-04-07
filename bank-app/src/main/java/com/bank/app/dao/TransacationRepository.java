package com.bank.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.app.CompositeKey.TransactionId;
import com.bank.app.entity.Transacation;

/*** 
 * TransacationRepository is persistance layer of Transaction details
 * 
 * @author Vinothpandian P
 */

public interface TransacationRepository extends JpaRepository<Transacation, TransactionId>{
	
}
