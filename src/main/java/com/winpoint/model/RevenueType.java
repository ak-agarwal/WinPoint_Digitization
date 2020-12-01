package com.winpoint.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class RevenueType {
//	checked
	@Id
	private Integer revenueTypeId;
	private String revenueTypeName;

	
	@OneToMany(targetEntity = RevenueDetail.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "revenueTypeId", referencedColumnName = "revenueTypeId")
	private List<RevenueDetail> RevenueDetail;
	
	
//////////////////////
}
