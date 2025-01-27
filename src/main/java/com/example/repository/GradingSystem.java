package com.example.repository;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

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
	
//	@ManyToOne(targetEntity = GradingSystem.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "gradeId", referencedColumnName = "gradeId")
//	private List<GradingSystem> gradingSystem;
}
