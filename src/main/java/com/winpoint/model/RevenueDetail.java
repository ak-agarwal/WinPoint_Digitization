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
public class RevenueDetail {
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
	
	@ManyToOne(targetEntity = RevenueDetail.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "revenueDetailId", referencedColumnName = "revenueDetailId")
	private List<RevenueDetail> revenueDetail;
	
	@ManyToOne(targetEntity = RevenueType.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "revenueTypeId", referencedColumnName = "revenueTypeId")
	private List<RevenueType> RevenueType;
	
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
	@JoinColumn(name = "segmentTypeId", referencedColumnName = "segmentTypeId")
	private List<SegmentType> segmentType;
	
	@ManyToOne(targetEntity = Organization.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "organizationId", referencedColumnName = "organizationId")
	private List<Organization> organization;
	
	@ManyToOne(targetEntity = UserProfile.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "userId", referencedColumnName = "userId")
	private List<UserProfile> userProfile;

}
