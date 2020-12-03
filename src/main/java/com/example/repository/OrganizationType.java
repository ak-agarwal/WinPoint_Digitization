package com.example.repository;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class OrganizationType {
//	checked
	@Id
	private Integer organizationTypeId;
	private String organizationTypeName;
	
//	@ManyToOne(targetEntity = OrganizationType.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "organizationTypeId", referencedColumnName = "organizationTypeId")
//	private List<OrganizationType> organizationType;


}
