package com.winpoint.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class StudentTestResultJava_CRT {
//	checked
//	fk
	private Integer userTestId;
	private Integer qNumber;
	private Integer questionId;
	private Character studentResponse;
	private String isCorrect;
	private Integer createdBy;
	private Date createdDate;
	
	@ManyToOne(targetEntity = UserTestDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "userTestId", referencedColumnName = "userTestId")
	private List<UserTestDetails> userTestDetails;

	@ManyToOne(targetEntity = TechnicalQuestionBank.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "questionId", referencedColumnName = "questionId")
	private List<TechnicalQuestionBank> technicalQuestionBank;

}
