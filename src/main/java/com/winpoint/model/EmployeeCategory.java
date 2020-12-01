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
//checked
@Entity
@Data
public class EmployeeCategory {
	@Id
	private Integer employeeCategoryId;
	private String employeeCategoryName;
	private Integer createdBy;
	private Date createdDate;

	
	
	@OneToMany(targetEntity = EmployeeCategory.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "employeeCategoryId", referencedColumnName = "employeeCategoryId")
	private List<EmployeeDetails> EmployeeDetails;
	
	//////////////////

}
