package com.bank.app.service;

import java.util.List;
import java.util.Objects;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.bank.app.dao.TransacationRepository;
import com.bank.app.entity.Account;
import com.bank.app.entity.Transacation;
import com.bank.app.vo.SearchVo;

/*** 
 * TransactionService acts as business layer of transaction
 * 
 * @author Vinothpandian P
 */

@Service
public class TransactionService {
	
	@Autowired
	TransacationRepository transacationRepository;

	/*** 
	 * getTransactionDetails is used to get the transaction details
	 * 
	 * @param searchVo
	 * @return transactionList
	 */
	
	public List<Transacation> getTransactionDetails(SearchVo searchVo) {
		List<Transacation> transactionList =  transacationRepository.findAll(new Specification<Transacation>() {
			@Override
			public Predicate toPredicate(Root<Transacation> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				Predicate predicate = criteriaBuilder.conjunction();
				if(Objects.nonNull(searchVo.getStartDate()) && Objects.nonNull(searchVo.getEndDate()) && searchVo.getStartDate().before(searchVo.getEndDate())) {
					predicate = criteriaBuilder.and(predicate,criteriaBuilder.between(root.get("transactionDate"),searchVo.getStartDate(),searchVo.getEndDate()));
				}
				if(!StringUtils.isEmpty(searchVo.getAccountNo())) {
					predicate = criteriaBuilder.and(predicate,criteriaBuilder.like(root.get("referenceNo"), "%" + searchVo.getAccountNo() + "%"));
				}
				query.orderBy(criteriaBuilder.asc(root.get("referenceNo")));
				return predicate;
			}
		});
		return transactionList;
	}

}
