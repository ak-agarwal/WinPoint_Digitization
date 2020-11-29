package com.winpoint.model;

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
public class StudentCourseFeesBean {
	
	private Integer userId;//
	private String fisrtName;
	private String lastName;
	private Integer courseId;//
	private String courseName;
	private String feeStatus;
	private Integer fees;
	
	
	@ManyToOne
	private UserProfile UserProfile;
	
	@OneToMany(targetEntity = UserProfile.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "userId", referencedColumnName = "userId")
	private List<UserProfile> userProfiles;	
	
	
	
	@ManyToOne
	private Course Course;
	
	
	@OneToMany(targetEntity = Course.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "courseId", referencedColumnName = "courseId")
	private List<Course> courses;	
	
}
