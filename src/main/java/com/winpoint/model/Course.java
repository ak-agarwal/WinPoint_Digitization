package com.winpoint.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.Data;
//checked//
@Entity
@Data
public class Course {
	private Integer courseId;
	private String courseName;
	private String preRequisite;
	private Integer courseDuration;
	private Integer courseFees;
	private Integer streamId;
	private Integer courseTypeId;
	private String coursewareExist;
	private Integer evaluationTypeId;
	private Integer totalTests;
	private Integer createdBy;
	private Date createdDate;
	private Integer logoLocation;
	
	
//	@OneToMany(targetEntity = Course.class,  cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "courseId", referencedColumnName = "courseId")
//	private List<Course> courses;
	
	
	
	
	
	
	
	
	
	
	@ManyToOne
	private Streams stream;
	
	
//	@OneToMany(targetEntity = Course.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "streamId", referencedColumnName = "streamId")
//	private List<Course> Course;
	
	
	
	@ManyToOne
	private CourseType courseType;
	
//	@OneToMany(targetEntity = Course.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "courseTypeId", referencedColumnName = "courseTypeId")
//	private List<Course> Course;
	
	
	
	@ManyToOne
	private EvaluationType EvaluationType;

//	@OneToMany(targetEntity = Course.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "evaluationTypeId", referencedColumnName = "evaluationTypeId")
//	private List<Course> Course;
}
