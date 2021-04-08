package com.bank.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.app.entity.Account;
import com.bank.app.entity.Customer;

/*** 
 * CustomerRepository is persistance layer of account details
 * 
 * @author Vinothpandian P
 */

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
	
}
