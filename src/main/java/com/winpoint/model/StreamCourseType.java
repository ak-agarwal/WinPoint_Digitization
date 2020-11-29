package com.winpoint.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class StreamCourseType {
//	checked
	@Id
	private Integer streamCourseTypeId;
	private Integer streamId;
	private Integer courseTypeId;
	private Date createdDate;
	private String createdBy;
	
	@ManyToOne
	private StreamCourseType StreamCourseType;
	
	@OneToMany(targetEntity = StreamCourseType.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "streamCourseTypeId", referencedColumnName = "streamCourseTypeId")
	private List<StreamCourseType> streamCourseType;

	
	
	@ManyToOne
	private Streams Streams;
	
	
	@OneToMany(targetEntity = Streams.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "streamId", referencedColumnName = "streamId")
	private List<Streams> streams;

	
	
	@ManyToOne
	private CourseType CourseType;
	
	@OneToMany(targetEntity = CourseType.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "courseTypeId", referencedColumnName = "courseTypeId")
	private List<CourseType> courseType;

	
}
