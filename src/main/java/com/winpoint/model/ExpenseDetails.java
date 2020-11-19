package com.winpoint.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
	

	@ManyToOne(targetEntity = ExpenseDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "expenseDetailsId", referencedColumnName = "expenseDetailsId")
	private List<ExpenseDetails> expenseDetails;
	
	@ManyToOne(targetEntity = ExpenseType.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "expenseTypeId", referencedColumnName = "expenseTypeId")
	private List<ExpenseType> ExpenseType;
	
	@ManyToOne(targetEntity = Course.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "courseId", referencedColumnName = "courseId")
	private List<Course> course;
	
	@ManyToOne(targetEntity = BatchDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "batchId", referencedColumnName = "batchId")
	private List<BatchDetails> batchDetails;
	
	@ManyToOne(targetEntity = PaymentMode.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "paymentModeId", referencedColumnName = "paymentModeId")
	private List<PaymentMode> paymentMode;
	
	@ManyToOne(targetEntity = SegmentType.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "segemntTypeId", referencedColumnName = "segemntTypeId")
	private List<SegmentType> segmentType;
	
	@ManyToOne(targetEntity = Organization.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "organizationId", referencedColumnName = "organizationId")
	private List<Organization> Organization;
	
}
