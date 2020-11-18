package com.winpoint.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;
//checked
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
	
	
	@OneToMany(targetEntity = Course.class,  cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "courseId", referencedColumnName = "courseId")
	private List<Course> courses;
	
	@OneToMany(targetEntity = Streams.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "streamId", referencedColumnName = "streamId")
	private List<Streams> streams;
	
	@OneToMany(targetEntity = CourseType.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "courseTypeId", referencedColumnName = "courseTypeId")
	private List<CourseType> courseTypes;

	
	@OneToMany(targetEntity = EvaluationType.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "evaluationTypeId", referencedColumnName = "evaluationTypeId")
	private List<EvaluationType> evaluationTypes;
}
