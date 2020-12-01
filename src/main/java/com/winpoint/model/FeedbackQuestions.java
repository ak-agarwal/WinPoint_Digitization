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
public class FeedbackQuestions {
//	checked//
	@Id
	private Integer feedbackQuestionId;
	private Integer feedbackCategoryId;
	private String feedbackQuestion;
	private Integer feedbackQuestionTypeId;
	private Integer createdBy;
	private Date createdDate;

	
	
	
	@OneToMany(targetEntity = FeedbackQuestions.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "feedbackQuestionId", referencedColumnName = "feedbackQuestionId")
	private List<TestFeedback> TestFeedback;
	
	/////////////////
	@ManyToOne
	private FeedbackCategory FeedbackCategory;

	@ManyToOne
	private FeedbackQuestionType FeedbackQuestionType;

}
