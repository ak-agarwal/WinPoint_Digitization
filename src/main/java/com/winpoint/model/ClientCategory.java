package com.winpoint.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
//checked
@Entity 
@Data
public class ClientCategory {
//	checked//
	@Id
	private Integer clientCategoryId;
	private String clientCategory;
	private Integer createdBy;
	private Date createdDate;
	
	
}
