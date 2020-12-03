package com.example.repository;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
//checked
@Entity
@Data
public class Course {
	@Id
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
//	
//	@OneToMany(targetEntity = Streams.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "streamId", referencedColumnName = "streamId")
//	private List<Streams> streams;
//	
//	@OneToMany(targetEntity = CourseType.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "courseTypeId", referencedColumnName = "courseTypeId")
//	private List<CourseType> courseTypes;
//
//	@OneToMany(targetEntity = EvaluationType.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "evaluationTypeId", referencedColumnName = "evaluationTypeId")
//	private List<EvaluationType> evaluationTypes;
}
