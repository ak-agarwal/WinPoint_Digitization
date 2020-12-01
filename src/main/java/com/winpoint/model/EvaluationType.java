package com.winpoint.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class EvaluationType {
//	checked//
	@Id
	private Integer evaluationTypeId;
	private String evaluationTypeName;
	private String offlineCheck;
	private Integer createdBy;
	private Date createdDate;

	
	
	@OneToMany(targetEntity = Course.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "evaluationTypeId", referencedColumnName = "evaluationTypeId")
	private List<Course> Course;
	
	
	@OneToMany(targetEntity = TestDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "evaluationTypeId", referencedColumnName = "evaluationTypeId")
	private List<TestDetails> TestDetails;	
	
/////////////////////////////////
	
}
