package com.example.repository;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
//checked
@Entity
@Data
public class CourseType {
	@Id
	private Integer courseTypeId;
	private String courseTypeName;
	private Integer createdBy;
	private Date createddDate;
	

//	@OneToMany(targetEntity = CourseType.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "courseTypeId", referencedColumnName = "courseTypeId")
//	private List<CourseType> courseType;


}
