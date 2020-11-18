package com.winpoint.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
//checked
@Entity
@Data
public class EmployeeDetails {
	private Integer userId;
	private Double employeeSalary;
	private String dateOfJoining;
	private Integer employeeCategoryId;
	private Integer createdBy;
	private Date createdDate;
	
	@ManyToOne(targetEntity = EmployeeCategory.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "employeeCategoryId", referencedColumnName = "employeeCategoryId")
	private List<Course> employeeCategories;
	
	@ManyToOne(targetEntity = UserProfile.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "userId", referencedColumnName = "userId")
	private List<UserProfile> userProfiles;
	
	}
