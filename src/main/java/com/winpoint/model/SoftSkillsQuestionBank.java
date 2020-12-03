package com.winpoint.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class SoftSkillsQuestionBank {
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

	
	@ManyToOne
	private Course Course;
	
	@OneToMany(targetEntity = Course.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "courseId", referencedColumnName = "courseId")
	private List<Course> course;

	
	
	@ManyToOne
	private Topics Topics;
	
	@OneToMany(targetEntity = Topics.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "topicId", referencedColumnName = "topicId")
	private List<Topics> topics;

	
	
	@ManyToOne
	private DifficultyLevel DifficultyLevel;
	
	@OneToMany(targetEntity = DifficultyLevel.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "difficultyLevelId", referencedColumnName = "difficultyLevelId")
	private List<DifficultyLevel> difficultyLevel;

	
}
