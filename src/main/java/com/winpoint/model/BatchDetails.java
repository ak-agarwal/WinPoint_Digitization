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
//one error
@Entity
@Data
public class BatchDetails {
//	checked
	@Id
	private Integer batchId;
	private Integer courseId;	
	private Integer facultyUserId;
	private Date beginDate;
	private Date endDate;
	private Integer createdBy;
	private Date createdDate;
	private String batchName;
	private Integer batchTime;
	private Integer currentLectureNumber;
	private String lectureDuration; 
//	private String facultyName;		//this is not there in the original table
	private Integer totalNumberOfLectures;//
	private Integer segmentTypeId;//

	@OneToMany(targetEntity = Course.class,  cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "courseId", referencedColumnName = "courseId")
	private List<Course> courses;
	
	@OneToMany(targetEntity = FacultySkills.class,  cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "facultyUserId", referencedColumnName = "facultyId")
	private List<FacultySkills> facultyTypes;
	
	@OneToMany(targetEntity = SegmentType.class,  cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "segmentTypeId", referencedColumnName = "segmentTypeId")
	private List<SegmentType> segmentTypes;
}










