package com.example.repository;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class FeedbackCategory {
//	checked
	@Id
	private Integer feedbackCategoryId;
	private String feedbackCategoryDescription;
	
//	@ManyToOne(targetEntity = FeedbackCategory.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "feedbackCategoryId", referencedColumnName = "feedbackCategoryId")
//	private List<FeedbackCategory> feedbackCategory;	

}
