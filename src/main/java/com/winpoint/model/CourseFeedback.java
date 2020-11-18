package com.winpoint.model;

import java.util.Date;

import javax.persistence.Entity;

import lombok.Data;
//checked
//fk remain
@Entity
@Data
public class CourseFeedback {
	private Integer userId;		//this both two are composite key s
	private Integer courseId;		
	private Integer feedbackQuestionId;
	private String response;
	private String markedForReview;
	private Integer createdBy;
	private Date createdDate;
	
	

	
}