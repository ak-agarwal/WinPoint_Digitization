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
public class ToolTips {
//	checked
//	fk redo
	@Id
	private Integer toolTipId;
	private Integer courseTypeId;
	private String toolTipDescription;
	private Integer createdBy;
	private Date createdDate;
	
	@ManyToOne(targetEntity = CourseType.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "courseTypeId", referencedColumnName = "courseTypeId")
	private List<CourseType> CourseTypes;	
	
	@ManyToOne(targetEntity = ToolTips.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "toolTipId", referencedColumnName = "toolTipId")
	private List<ToolTips> toolTips;	

}
