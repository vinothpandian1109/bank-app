package com.bank.app.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*** 
 * SearchVo class acts as a Data transfer oject to perform filter 
 * operation
 * 
 * @author Vinothpandian P
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SearchVo {
	
	private long accountNo;
	
	private long customerId;
	
	private Date startDate;
	
	private Date endDate;
	
}
