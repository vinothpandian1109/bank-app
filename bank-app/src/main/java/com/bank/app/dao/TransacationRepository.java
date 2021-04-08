package com.bank.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bank.app.CompositeKey.TransactionId;
import com.bank.app.entity.Transacation;

/*** 
 * TransacationRepository is persistance layer of Transaction details
 * 
 * @author Vinothpandian P
 */

@Repository
@Transactional
public interface TransacationRepository extends JpaRepository<Transacation, TransactionId>,JpaSpecificationExecutor<Transacation>{
	
}
