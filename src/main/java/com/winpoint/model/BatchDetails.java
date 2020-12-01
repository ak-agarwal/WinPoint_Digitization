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

//checked
//one error
@Entity
@Data
public class BatchDetails {
//	checked//
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

//	@OneToMany(targetEntity = BatchDetails.class,  cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "batchId", referencedColumnName = "batchId")
//	private List<BatchDetails> batchDetails;

	@OneToMany(targetEntity = StudentCourseDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "batchId", referencedColumnName = "batchId")
	private List<StudentCourseDetails> StudentCourseDetails;

	@OneToMany(targetEntity = ExpenseDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "batchId", referencedColumnName = "batchId")
	private List<ExpenseDetails> ExpenseDetails;

	@OneToMany(targetEntity = Lecture.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "batchId", referencedColumnName = "batchId")
	private List<Lecture> Lecture;

	@OneToMany(targetEntity = RevenueDetail.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "batchId", referencedColumnName = "batchId")
	private List<RevenueDetail> RevenueDetail;

	/////////////////////////
	@ManyToOne
	private Course course;

	@ManyToOne
	private FacultySkills facultySkills;

	@ManyToOne
	private SegmentType segmentType;

}
