package com.winpoint.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class UserCategory {	
//	checked
	@Id
	private Integer userCategoryId;
	private String userCategoryName;
	private Integer createdBy;
	private Date createdDate;
	
	
}
