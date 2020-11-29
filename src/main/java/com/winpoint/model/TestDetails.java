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
	
	@OneToMany(targetEntity = Course.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "courseId", referencedColumnName = "courseId")
	private List<Course> userTestDetails;	
	
	@ManyToOne(targetEntity = EvaluationType.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "evaluationTypeId", referencedColumnName = "evaluationTypeId")
	private List<EvaluationType> EvaluationType;	
	
}
