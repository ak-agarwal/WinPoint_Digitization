package com.example.repository;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class TestDifficulty {
//	checked
//	fk
	@Id
	private Integer TestDifficulty;
	private Integer testDetailId;			//comp pk
	private Integer topicId;
	private Integer difficultyLevelId;
	private Integer numberOfQuestions;
	private Integer createdBy;
	private Date createdDate;
	
//	@ManyToOne(targetEntity = TestDifficulty.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "testDetailId", referencedColumnName = "testDetailId")
//	private List<TestDifficulty> testDifficulty;	
//	
//	@ManyToOne(targetEntity = Topics.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "topicId", referencedColumnName = "topicId")
//	private List<Topics> topics;	
//	
//	@ManyToOne(targetEntity = DifficultyLevel.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "difficultyLevelId", referencedColumnName = "difficultyLevelId")
//	private List<DifficultyLevel> difficultyLevel;	
	
}
