package com.winpoint.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class StudentTestResult_CPP_TBC {
//	checked
//	fk
	@Id
	private Integer StudentTestResult_CPP_TBC_Id;
	private Integer userTestId;
	private Integer qNumber;
	private Integer questionId;
	private Character studentResponse;
	private String isCorrect;
	private Integer createdBy;
	private Date createdDate;

	@ManyToOne
	private UserTestDetails UserTestDetails;

	@ManyToOne
	private TechnicalQuestionBank TechnicalQuestionBank;

}
