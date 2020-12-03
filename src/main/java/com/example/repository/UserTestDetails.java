package com.example.repository;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class UserTestDetails {
//	checked 
//	redo fk
	@Id
	private Integer userTestId;//
	private Integer userId;//
	private Integer testDetailsId;//
	private Integer marksReceived;
	private String timeTaken;
	private Integer numberOfRegistration;
	private String feeStatus;
	private Integer createdBy;
	private Date createdDate;
	private Integer attempted;
	private String evaluationDone;
	
//	@ManyToOne(targetEntity = UserProfile.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "userId", referencedColumnName = "userId")
//	private List<UserProfile> UserProfiles;
//	
//	@ManyToOne(targetEntity = UserTestDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "userTestId", referencedColumnName = "userTestId")
//	private List<UserTestDetails> UserTestDetail;
//	
//	@ManyToOne(targetEntity = TestDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "testDetailsId", referencedColumnName = "testDetailsId")
//	private List<TestDetails> TestDetails;
}