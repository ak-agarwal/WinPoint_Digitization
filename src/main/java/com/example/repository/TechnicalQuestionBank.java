package com.example.repository;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class TechnicalQuestionBank {
//	checked
//	fk
	@Id
	private String questionId;
	private String courseId;
	private String topicId;
	private String question;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private Character correctOption;
	private Integer marks;
	private String explanation;
	private Integer difficultyLevelId;
	private String inCrt;
	private String createdBy;
	private Date createdDate;	
	
//	@ManyToOne(targetEntity = SoftSkillsQuestionBank.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "questionId", referencedColumnName = "questionId")
//	private List<SoftSkillsQuestionBank> softSkillsQuestionBank;
//
//	@ManyToOne(targetEntity = Course.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "courseId", referencedColumnName = "courseId")
//	private List<Course> course;
//
//	@ManyToOne(targetEntity = Topics.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "topicId", referencedColumnName = "topicId")
//	private List<Topics> topics;
//
//	@ManyToOne(targetEntity = DifficultyLevel.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "difficultyLevelId", referencedColumnName = "difficultyLevelId")
//	private List<DifficultyLevel> difficultyLevel;

}
