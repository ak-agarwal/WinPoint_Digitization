package com.winpoint.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class SecurityQuestions {
//	checked
	@Id
	private Integer securityQuestionId;
	private String securityQuestion;
	private Integer createdBy;
	private Date createdDate;
	
	
}