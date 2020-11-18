package com.winpoint.model;

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
	
	
}
