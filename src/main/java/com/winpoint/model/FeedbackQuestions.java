package com.winpoint.model;

import java.util.Date;
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
public class FeedbackQuestions {
//	checked
	@Id
	private Integer feedbackQuestionId;
	private Integer feedbackCategoryId;
	private String feedbackQuestion;
	private Integer feedbackQuestionTypeId;
	private Integer createdBy;
	private Date createdDate;
	
	@ManyToOne(targetEntity = FeedbackQuestions.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "feedbackQuestionId", referencedColumnName = "feedbackQuestionId")
	private List<FeedbackQuestions> feedbackQuestions;
	
	@ManyToOne(targetEntity = FeedbackCategory.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "feedbackCategoryId", referencedColumnName = "feedbackCategoryId")
	private List<FeedbackCategory> feedbackCategories;
	
	@ManyToOne(targetEntity = FeedbackQuestionType.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "feedbackQuestionTypeId", referencedColumnName = "feedbackQuestionTypeId")
	private List<FeedbackQuestionType> feedbackQuestionTypes;
}
