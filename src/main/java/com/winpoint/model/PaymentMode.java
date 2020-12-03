package com.winpoint.model;

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
public class PaymentMode {
//	Chekced
	@Id
	private Integer paymentModeId;
	private String paymentModeName;
	
	@ManyToOne(targetEntity = PaymentMode.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "paymentModeId", referencedColumnName = "paymentModeId")
	private List<PaymentMode> paymentMode;

	
}
