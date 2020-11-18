package com.winpoint.model;

import java.util.Date;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class StudentTestResult_C_Modular {
//	checked
//	fk
	private Integer userTestId;
	private Integer qNumber;
	private Integer questionId;
	private Character studentResponse;
	private String isCorrect;
	private Integer createdBy;
	private Date createdDate;
}
