package com.winpoint.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
//schema checked 
//creation of fk
public class ExpenseDetails {
	@Id
	private Integer expenseDetailsId;
	private Integer expenseTypeId;
	private Date expenseDate;
	private Integer expenseAmount;
	private String expenseDescription;
	private Integer courseId;
	private Integer batchId;
	private Integer paymentModeId;
	private String chequeNumber;
	private Integer segemntTypeId;
	private Integer organizationId;
	private String receiptNumber;
}
