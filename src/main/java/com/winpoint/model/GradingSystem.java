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
public class GradingSystem {
//	checked
	@Id
	private String gradeId;
	private Integer marksLowerLimit;
	private Integer marksHigherLimit;
	private Integer createdBy;
	private Date createdDate;
	
	@ManyToOne(targetEntity = GradingSystem.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "gradeId", referencedColumnName = "gradeId")
	private List<GradingSystem> gradingSystem;
}
