package com.example.repository;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class StudentTestResultJavascriptModular {

	@Id
	private Integer StudentTestResultJavascriptModular;
	private Integer userTestId;
	private Integer qNumber;
	private Integer questionId;
	private Character studentResponse;
	private String isCorrect;
	private Integer createdBy;
	private Date createdDate;
	
//	@ManyToOne(targetEntity = UserTestDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "userTestId", referencedColumnName = "userTestId")
//	private List<UserTestDetails> userTestDetails;
//
//	@ManyToOne(targetEntity = TechnicalQuestionBank.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "questionId", referencedColumnName = "questionId")
//	private List<TechnicalQuestionBank> technicalQuestionBank;

}
