package com.winpoint.model;

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
public class Organization {
//	checked
	@Id
	private Integer organizationId;
	private String organizationName;
	private String organizationType;
	
	@ManyToOne(targetEntity = Organization.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "organizationId", referencedColumnName = "organizationId")
	private List<Organization> organization;

}
