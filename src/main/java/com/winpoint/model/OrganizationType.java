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
public class OrganizationType {
//	checked
	@Id
	private Integer organizationTypeId;
	private String organizationTypeName;
	
	@ManyToOne(targetEntity = OrganizationType.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "organizationTypeId", referencedColumnName = "organizationTypeId")
	private List<OrganizationType> organizationType;


}
