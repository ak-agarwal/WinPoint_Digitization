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
//checked
//TO DO
@Entity
@Data
public class EmployeeDetails {
	private Integer userId;
	private Double employeeSalary;
	private String dateOfJoining;
	private Integer employeeCategoryId;
	private Integer createdBy;
	private Date createdDate;
	
	
	@ManyToOne
	private EmployeeCategory EmployeeCategory;
	
//	@OneToMany(targetEntity = EmployeeCategory.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "employeeCategoryId", referencedColumnName = "employeeCategoryId")
//	private List<EmployeeDetails> EmployeeDetails;
	
	
	@ManyToOne
	private UserProfile UserProfile;
	
//	@OneToMany(targetEntity = EmployeeDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "userId", referencedColumnName = "userId")
//	private List<EmployeeDetails> EmployeeDetails;
	
	}
