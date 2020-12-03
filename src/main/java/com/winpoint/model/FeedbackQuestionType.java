package com.winpoint.model;

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
public class FeedbackQuestionType {
//	checked
	@Id
	private Integer feedbackQuestionTypeId;
	private String feedbackQuestionType;
	
	@ManyToOne(targetEntity = FeedbackQuestionType.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "feedbackQuestionTypeId", referencedColumnName = "feedbackQuestionTypeId")
	private List<FeedbackQuestionType> feedbackQuestionTypeObject;
	
}
