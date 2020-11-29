package com.winpoint.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class SegmentType {
//	checked
	@Id
	private Integer segmentTypeId;
	private String segmentTypeName;

//	@ManyToOne(targetEntity = SegmentType.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "segmentTypeId", referencedColumnName = "segmentTypeId")
//	private List<SegmentType> segmentType;

}
