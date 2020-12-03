package com.example.repository;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Organization {
//	checked
	@Id
	private Integer organizationId;
	private String organizationName;
	private String organizationType;
	
//	@ManyToOne(targetEntity = Organization.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "organizationId", referencedColumnName = "organizationId")
//	private List<Organization> organization;

}
