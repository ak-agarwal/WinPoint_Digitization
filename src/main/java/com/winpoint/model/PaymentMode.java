package com.winpoint.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class PaymentMode {
//	Chekced
	@Id
	private Integer paymentModeId;
	private String paymentModeName;
	
	@OneToMany(targetEntity = ExpenseDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "paymentModeId", referencedColumnName = "paymentModeId")
	private List<ExpenseDetails> ExpenseDetails;
	
	
	
	@OneToMany(targetEntity = RevenueDetail.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "paymentModeId", referencedColumnName = "paymentModeId")
	private List<RevenueDetail> RevenueDetail;
	
	
	//////////////////
	
}
