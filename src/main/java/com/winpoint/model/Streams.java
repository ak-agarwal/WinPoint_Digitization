package com.winpoint.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Streams {
//	checked
	@Id
	private Integer streamId;
	private String streamName;
	private Integer createdBy;
	private Date createdDate;
	
	
}