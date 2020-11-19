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
public class TestFeedback {
//	checked
//	fk redo
	@Id
	private Integer userTestId;
	private Integer feedbackQuestionId;
	private String response;
	private Integer createdBy;
	private Date createdDate;
	

	
	@ManyToOne(targetEntity = FeedbackQuestions.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "feedbackQuestionId", referencedColumnName = "feedbackQuestionId")
	private List<FeedbackQuestions> feedbackQuestions;	

	@ManyToOne(targetEntity = UserTestDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "userTestId", referencedColumnName = "userTestId")
	private List<UserTestDetails> userTestDetails;	
}
