package com.example.repository;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class TestDetails {
//	checked
//	redo fk
	@Id
	private Integer testDetailId;
	private String courseId;//
	private Integer testNumber;
	private Integer totalQuestions;
	private String rules;
	private String testFees;
	private String negativeMarking;
	private Integer evaluationTypeId;
	private Integer createdBy;
	private Date createdDate;
	
//	@ManyToOne(targetEntity = UserProfile.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "userId", referencedColumnName = "userId")
//	private List<UserProfile> userProfiles;	
//	
//	@ManyToOne(targetEntity = UserTestDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "userTestId", referencedColumnName = "userTestId")
//	private List<UserTestDetails> userTestDetails;	
//	
//	@ManyToOne(targetEntity = Test.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "testId", referencedColumnName = "testId")
//	private List<Test> tests;	
	
}
