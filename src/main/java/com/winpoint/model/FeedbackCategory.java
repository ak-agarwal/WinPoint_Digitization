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
public class FeedbackCategory {
//	checked
	@Id
	private Integer feedbackCategoryId;
	private String feedbackCategoryDescription;
	
	@ManyToOne(targetEntity = FeedbackCategory.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "feedbackCategoryId", referencedColumnName = "feedbackCategoryId")
	private List<FeedbackCategory> feedbackCategory;	

}
