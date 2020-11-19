package com.winpoint.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;
//checked
@Entity 
@Data
public class ClientCategory {
//	checked
	@Id
	private Integer clientCategoryId;
	private String clientCategory;
	private Integer createdBy;
	private Date createdDate;
	
	@OneToMany(targetEntity = ClientCategory.class,  cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "clientCategoryId", referencedColumnName = "clientCategoryId")
	private List<ClientCategory> clientCategoryObject;
}
