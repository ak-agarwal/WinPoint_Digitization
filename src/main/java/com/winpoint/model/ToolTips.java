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
public class ToolTips {
//	checked
//	fk redo
	@Id
	private Integer toolTipId;
	private Integer courseTypeId;
	private String toolTipDescription;
	private Integer createdBy;
	private Date createdDate;
	
	
	
	
	@ManyToOne
	private CourseType CourseType;
	
	
	@OneToMany(targetEntity = ToolTips.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "courseTypeId", referencedColumnName = "courseTypeId")
	private List<ToolTips> ToolTips;	
	
	

}
