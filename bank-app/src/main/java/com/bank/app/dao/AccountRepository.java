package com.bank.app.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.app.entity.Account;

public interface AccountRepository extends JpaRepository<Account, UUID>{

}
