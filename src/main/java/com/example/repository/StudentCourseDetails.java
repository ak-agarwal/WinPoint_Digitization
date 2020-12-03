package com.example.repository;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class StudentCourseDetails {
//	checked
//	fk
//	comp fk
	@Id
	private Integer StudentCourseDetailsId;//
	private Integer userId;//
	private Integer courseId;// composite pk
	private Integer batchId;//
	private String courseName;
	private String logoLocation;
	private String courseTypeName;
	private String streamName;
	private String feedbackGiven;
	private String certificateGiven;
	private Integer courseAggr;
	private String gradeId;//
	private String feeStatus;
	private Integer createdBy;
	private Date createdDate;
	private String coursewareIssued;
	private String assignmentsIssued;
	private String assignmentsSubmitted;
	private String reminderTypeId;//
	private Integer feeReminderCount;
	private Integer studentCount;
	private Integer dueAmount;
	private int percentageAttendance;
	private BatchDetails batchDetails;

//	@ManyToOne(targetEntity = BatchDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "batchId", referencedColumnName = "batchId")
//	private List<BatchDetails> batches;
//
//	@ManyToOne(targetEntity = ReminderType.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "reminderTypeId", referencedColumnName = "reminderTypeId")
//	private List<ReminderType> remainderTypes;
//
//	@ManyToOne(targetEntity = GradingSystem.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "gradeId", referencedColumnName = "gradeId")
//	private List<ReminderType> gradeTypes;
//	
//	@ManyToOne(targetEntity = Course.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "courseId", referencedColumnName = "courseId")
//	private List<Course> course;
//	
//	@ManyToOne(targetEntity = UserProfile.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "userId", referencedColumnName = "userId")
//	private List<UserProfile> userProfile;

}
