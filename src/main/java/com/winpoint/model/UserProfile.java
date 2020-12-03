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
public class UserProfile {
//	checked
//	redo fk
	@Id
	private Integer userId;
	
	private String firstName;
	private String lastName;
	private String emailId;
	private String mobileNumber;
	private String address;
	private Date birthDate;
	private String college;
	private String degree;
	private String branch;
	private Integer yearOfGraduation;
	private String photoLocation;
	private String password;
	private String gender;
	private Integer securityQuestionId;//
	
	private String securityQuestion;
	private String securityAnswer;
	private Integer userCategoryId;//
	
	private String occupation;
	private String organization;
	private String designation;
	private String domain;
	private String role;
	private Integer experience;
	private Integer createdBy;
	private Date createDate;
	private String timeSlotsId;//
	
	private Integer segmentTypeId;//
	
	private String courseAlreadyDone;
	private Boolean activeStatus;
	
	@ManyToOne(targetEntity = UserProfile.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "userId", referencedColumnName = "userId")
	private List<UserProfile> userProfile;	

	
	@ManyToOne(targetEntity = SecurityQuestions.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "securityQuestionId", referencedColumnName = "securityQuestionId")
	private List<SecurityQuestions> securityQuestions;	

	@ManyToOne(targetEntity = UserCategory.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "userCategoryId", referencedColumnName = "userCategoryId")
	private List<UserCategory> UserCategories;	

	@ManyToOne(targetEntity = TimeSlots.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "timeSlotsId", referencedColumnName = "timeSlotsId")
	private List<TimeSlots> timeSlots;	
	
	@ManyToOne(targetEntity = SegmentType.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "segmentTypeId", referencedColumnName = "segmentTypeId")
	private List<SegmentType> SegmentTypes;	

	
}
