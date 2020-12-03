package com.winpoint.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class RevenueType {
//	checked
	@Id
	private Integer revenueTypeId;
	private String revenueTypeName;

//	@ManyToOne(targetEntity = RevenueType.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "revenueTypeId", referencedColumnName = "revenueTypeId")
//	private List<RevenueType> revenueType;

}
