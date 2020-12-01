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

	@OneToMany(targetEntity = ModularTestResult_C_TBC.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "questionId", referencedColumnName = "questionId")
	private List<ModularTestResult_C_TBC> ModularTestResult_C_TBC;

	@OneToMany(targetEntity = TechnicalQuestionBank.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "questionId", referencedColumnName = "questionId")
	private List<StudentTestResult_C_Modular> StudentTestResult_C_Modular;

	@OneToMany(targetEntity = StudentTestResult_CPP_CRT.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "questionId", referencedColumnName = "questionId")
	private List<StudentTestResult_CPP_CRT> StudentTestResult_CPP_CRT;

	@OneToMany(targetEntity = StudentTestResult_CPP_Modular.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "questionId", referencedColumnName = "questionId")
	private List<StudentTestResult_CPP_Modular> StudentTestResult_CPP_Modular;

	@OneToMany(targetEntity = StudentTestResult_CPP_TBC.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "questionId", referencedColumnName = "questionId")
	private List<StudentTestResult_CPP_TBC> StudentTestResult_CPP_TBC;

	@OneToMany(targetEntity = TechnicalQuestionBank.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "questionId", referencedColumnName = "questionId")
	private List<StudentTestResultComputerNetwork_CRT> StudentTestResultComputerNetwork_CRT;

	@OneToMany(targetEntity = TechnicalQuestionBank.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "questionId", referencedColumnName = "questionId")
	private List<StudentTestResultJava_CRT> StudentTestResultJava_CRT;

	@OneToMany(targetEntity = TechnicalQuestionBank.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "questionId", referencedColumnName = "questionId")
	private List<StudentTestResultJava_TBC> StudentTestResultJava_TBC;

	@OneToMany(targetEntity = StudentTestResultJavaModular.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "questionId", referencedColumnName = "questionId")
	private List<StudentTestResultJavaModular> StudentTestResultJavaModular;

	@OneToMany(targetEntity = StudentTestResultJavascriptModular.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "questionId", referencedColumnName = "questionId")
	private List<StudentTestResultJavascriptModular> StudentTestResultJavascriptModular;

	@ManyToOne(targetEntity = StudentTestResultOperatingSystem_CRT.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "questionId", referencedColumnName = "questionId")
	private List<StudentTestResultOperatingSystem_CRT> StudentTestResultOperatingSystem_CRT;

	///////////////////////////

	@ManyToOne
	private Course Course;

	@ManyToOne
	private Topics Topics;

	@ManyToOne
	private DifficultyLevel DifficultyLevel;

}
