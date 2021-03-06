package com.bank.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bank.app.entity.Transacation;
import com.bank.app.service.TransactionService;
import com.bank.app.vo.SearchVo;

/*** 
 * TransacationController is the presentation layer of transaction
 * 
 * @author Vinothpandian P
 *
 */

@RestController
@RequestMapping(path = "/transaction")
public class TransacationController {


	@Autowired
	private TransactionService transactionService;

	
	/*** 
	 * getTransactionDetails is used to get the transaction details
	 * 
	 * @param searchVo
	 * @return transactionList
	 */
	
	@PostMapping("/details")
	public List<Transacation> getTransactionDetails(@RequestBody SearchVo searchVo) {
		return transactionService.getTransactionDetails(searchVo);
	}

}
