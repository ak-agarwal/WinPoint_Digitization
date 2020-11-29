package com.winpoint.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class FeedbackCategory {
//	checked//
	@Id
	private Integer feedbackCategoryId;
	private String feedbackCategoryDescription;
	
	

}
