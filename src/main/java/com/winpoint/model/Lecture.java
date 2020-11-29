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
public class Lecture {
//	checked 
	@Id
	private Integer lectureId;
	private Integer batchId;
	private Integer lectureNumber;
	private Integer lectureDuration;
	private Date startTime;
	private String lectureCoverage;
	private Date lectureDate;
	private String comments;
	private String absentees;
	

	
	
	@ManyToOne
	private BatchDetails BatchDetails;
	
//	@OneToMany(targetEntity = Lecture.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "batchId", referencedColumnName = "batchId")
//	private List<Lecture> Lecture;
	
	
}
