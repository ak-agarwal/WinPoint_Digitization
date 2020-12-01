package com.winpoint.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class FeedbackCategory {
//	checked//
	@Id
	private Integer feedbackCategoryId;
	private String feedbackCategoryDescription;

	
	@OneToMany(targetEntity = FeedbackQuestions.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "feedbackCategoryId", referencedColumnName = "feedbackCategoryId")
	private List<FeedbackQuestions> FeedbackQuestions;
	
	///////////////////
}
