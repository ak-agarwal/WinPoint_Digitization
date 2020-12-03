package com.example.repository;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class PaymentMode {
//	Chekced
	@Id
	private Integer paymentModeId;
	private String paymentModeName;
	
//	@ManyToOne(targetEntity = PaymentMode.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "paymentModeId", referencedColumnName = "paymentModeId")
//	private List<PaymentMode> paymentMode;

	
}
