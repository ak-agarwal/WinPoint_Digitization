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

}