package com.winpoint.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Topics {
//	checked
//	fk
	@Id
	private Integer topicId;
	private Integer courseId;		//comp pk check
	private String topicName;
	private Integer minimumNoOfQuestionsForTest;
	private Integer createdBy;
	private Date createdDate;
	private Integer topicDuration;
	
	@ManyToOne(targetEntity = Topics.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "topicId", referencedColumnName = "topicId")
	private List<Topics> topics;	
	
	@ManyToOne(targetEntity = Course.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "courseId", referencedColumnName = "courseId")
	private List<Course> course;	
}
