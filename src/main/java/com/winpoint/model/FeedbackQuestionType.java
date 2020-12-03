package com.winpoint.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class FeedbackQuestionType {
//	checked
	@Id
	private Integer feedbackQuestionTypeId;
	private String feedbackQuestionType;
	
	
}
