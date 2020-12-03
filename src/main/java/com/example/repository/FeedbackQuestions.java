package com.example.repository;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

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
	
//	@ManyToOne(targetEntity = FeedbackQuestions.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "feedbackQuestionId", referencedColumnName = "feedbackQuestionId")
//	private List<FeedbackQuestions> feedbackQuestions;
//	
//	@ManyToOne(targetEntity = FeedbackCategory.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "feedbackCategoryId", referencedColumnName = "feedbackCategoryId")
//	private List<FeedbackCategory> feedbackCategories;
//	
//	@ManyToOne(targetEntity = FeedbackQuestionType.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "feedbackQuestionTypeId", referencedColumnName = "feedbackQuestionTypeId")
//	private List<FeedbackQuestionType> feedbackQuestionTypes;
}