package com.winpoint.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Organization {
//	checked
	@Id
	private Integer organizationTypeId;
	private String organizationName;
	private String organizationType;
}
