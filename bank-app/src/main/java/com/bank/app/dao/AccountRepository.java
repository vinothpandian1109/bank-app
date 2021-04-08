package com.bank.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.app.entity.Account;

/*** 
 * AccountRepository is persistance layer of account details
 * 
 * @author Vinothpandian P
 */

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{

}
