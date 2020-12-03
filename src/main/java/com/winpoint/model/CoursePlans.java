package com.winpoint.model;

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
@Entity
@Data
public class CoursePlans {
	
	@Id
	private Integer coursePlansId;
	private Integer courseId;
	private Integer lectureNumber;
	private String lecturePlan;

	
	
	
	@ManyToOne
	private Course Course;
	
//	@OneToMany(targetEntity = Course.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "courseId", referencedColumnName = "courseId")
//	private List<CoursePlans> CoursePlans;

}
