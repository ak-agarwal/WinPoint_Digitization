package com.winpoint.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class FacultySkills {
//	checked
	private Integer facultyUserId;
	private String skillSetId;
	private Integer createdBy;
	private Date createdDate;
	private String segmentTypeId;
	private String timeSlotsId;
	
	
	jnf4
	@ManyToOne
	private UserProfile UserProfile;
	
	@OneToMany(targetEntity = UserProfile.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "facultyUserId", referencedColumnName = "user")
	private List<UserProfile> employeeCategories;
}
