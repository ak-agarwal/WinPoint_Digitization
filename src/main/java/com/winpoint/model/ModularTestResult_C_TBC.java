package com.winpoint.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class ModularTestResult_C_TBC {

	
	private Integer userTestId;
	private Integer qNumber;
	private Integer questionId;
	private Character studentResponse;
	private String isCorrect;
	private Integer createdBy;
	private Date createdDate;
	
	
	
	@ManyToOne
	private UserTestDetails UserTestDetails;
	
//	@OneToMany(targetEntity = ModularTestResult_C_TBC.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "userTestId", referencedColumnName = "userTestId")
//	private List<ModularTestResult_C_TBC> ModularTestResult_C_TBC;
	
	
	@ManyToOne
	private TechnicalQuestionBank TechnicalQuestionBank;
	
//	@OneToMany(targetEntity = ModularTestResult_C_TBC.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "questionId", referencedColumnName = "questionId")
//	private List<ModularTestResult_C_TBC> ModularTestResult_C_TBC;
}
