package com.bank.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.app.entity.Account;

/*** 
 * AccountRepository is persistance layer of account details
 * 
 * @author Vinothpandian P
 */

public interface AccountRepository extends JpaRepository<Account, Long>{

}
