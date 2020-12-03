package com.example.repository;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class FacultySkills {
//	checked
	@Id
	private Integer facultyUserId;
	private String skillSetId;
	private Integer createdBy;
	private Date createdDate;
	private String segmentTypeId;
	private String timeSlotsId;
	
//	@ManyToOne(targetEntity = UserProfile.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "facultyUserId", referencedColumnName = "facultyUserId")
//	private List<UserProfile> employeeCategories;
//	
//	@ManyToOne(targetEntity = FacultySkills.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "skillSetId", referencedColumnName = "skillSetId")
//	private List<FacultySkills> facultySkills;
//	
//	@ManyToOne(targetEntity = SegmentType.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "segmentTypeId", referencedColumnName = "segmentTypeId")
//	private List<SegmentType> segmentTypes;
//	
//	@ManyToOne(targetEntity = UserProfile.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "timeSlotsId", referencedColumnName = "timeSlotsId")
//	private List<TimeSlots> timesSlots;
	
}
