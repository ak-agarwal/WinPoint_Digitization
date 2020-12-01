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
public class StudentCourseDetails {
//	checked
//	fk
//	comp fk
	@Id
	private Integer studentCourseDetailsId;
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

	@OneToMany(targetEntity = ReminderType.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "reminderTypeId", referencedColumnName = "reminderTypeId")
	private List<ReminderType> remainderTypes;

	@OneToMany(targetEntity = GradingSystem.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "gradeId", referencedColumnName = "gradeId")
	private List<ReminderType> gradeTypes;

	@ManyToOne
	private Course Course;
	@ManyToOne
	private UserProfile UserProfile;
	@ManyToOne
	private BatchDetails BatchDetails;

}
