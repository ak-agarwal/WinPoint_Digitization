package com.winpoint.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class UserStudent {
//	checked
//	redo fk
	
	private Integer userId;
	private String parentName;
	private String parentMobileNumber;
	private Integer clientCategoryId;
	private Integer createdBy;
	private Date createdDate;
	
	@ManyToOne(targetEntity = ClientCategory.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "clientCategoryId", referencedColumnName = "clientCategoryId")
	private List<ClientCategory> ClientCategories;
	
	
	@ManyToOne(targetEntity = UserProfile.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "userId", referencedColumnName = "userId")
	private List<UserProfile> UserProfiles;
	
}
