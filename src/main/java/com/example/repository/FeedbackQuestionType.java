package com.example.repository;

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
	
//	@ManyToOne(targetEntity = FeedbackQuestionType.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "feedbackQuestionTypeId", referencedColumnName = "feedbackQuestionTypeId")
//	private List<FeedbackQuestionType> feedbackQuestionTypeObject;
	
}
