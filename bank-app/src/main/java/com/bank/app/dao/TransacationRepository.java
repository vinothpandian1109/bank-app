package com.bank.app.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.app.entity.Transacation;

/*** 
 * TransacationRepository is persistance layer of Transaction details
 * 
 * @author Vinothpandian P
 */

public interface TransacationRepository extends JpaRepository<Transacation, UUID>{

}
