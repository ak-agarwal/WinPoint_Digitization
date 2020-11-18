package com.winpoint.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class revenueDetail {
//	checked
//	fk
	@Id
	private String revenueDetailId;
	private String revenueTypeId;
	private String receiptNumber;
	private String payerDescription;
	private String courseId;
	private String batchId;
	private String revenueAmount;
	private String paymentModeId;
	private String chequeNumber;
	private String segmentTypeId;
	private String organizationId;
	private String userId;
	private String receiveDate;
	

}
