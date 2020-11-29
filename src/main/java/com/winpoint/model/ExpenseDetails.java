package com.winpoint.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
	//done //
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
	

	
	
	
	@ManyToOne
	private ExpenseType ExpenseTypes;
	
//	@OneToMany(targetEntity = ExpenseDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "expenseTypeId", referencedColumnName = "expenseTypeId")
//	private List<ExpenseDetails> ExpenseDetails;
	
	
	
	@ManyToOne
	private Course Course;
	
//	@OneToMany(targetEntity = ExpenseDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "courseId", referencedColumnName = "courseId")
//	private List<ExpenseDetails> ExpenseDetails;
	
	
	
	
	@ManyToOne
	private BatchDetails BatchDetails;
	
	
//	@OneToMany(targetEntity = ExpenseDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "batchId", referencedColumnName = "batchId")
//	private List<ExpenseDetails> ExpenseDetails;

	
	
	@ManyToOne
	private PaymentMode PaymentMode;
	
	
//	@OneToMany(targetEntity = ExpenseDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "paymentModeId", referencedColumnName = "paymentModeId")
//	private List<ExpenseDetails> ExpenseDetails;
	
	
	
	@ManyToOne
	private SegmentType SegmentType;
	
	
//	@OneToMany(targetEntity = ExpenseDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "segemntTypeId", referencedColumnName = "segemntTypeId")
//	private List<ExpenseDetails> ExpenseDetails;
	
	
	
	@ManyToOne
	private Organization Organizations;
	
//	@OneToMany(targetEntity = ExpenseDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "organizationId", referencedColumnName = "organizationId")
//	private List<ExpenseDetails> ExpenseDetails;
	
}
