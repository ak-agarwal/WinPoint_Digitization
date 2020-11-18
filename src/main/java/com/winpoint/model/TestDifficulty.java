package com.winpoint.model;

import java.util.Date;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class TestDifficulty {
//	checked
//	fk
	
	private Integer testDetailId;			//comp pk
	private Integer topicId;
	private Integer difficultyLevelId;
	private Integer numberOfQuestions;
	private Integer createdBy;
	private Date createdDate;
	
	
}
