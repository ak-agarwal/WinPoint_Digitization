package com.example.repository;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
//checked
@Entity
@Data
public class CoursePlans {

	@Id
	private Integer CoursePlansId;
	private Integer courseId;
	private Integer lectureNumber;
	private String lecturePlan;

//	@OneToMany(targetEntity = Course.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "courseId", referencedColumnName = "courseId")
//	private List<Course> courses;

}
