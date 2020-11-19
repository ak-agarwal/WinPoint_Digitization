package com.winpoint.model;

import java.util.Date;
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
public class Streams {
//	checked
	@Id
	private Integer streamId;
	private String streamName;
	private Integer createdBy;
	private Date createdDate;
	
	@ManyToOne(targetEntity = Streams.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "streamId", referencedColumnName = "streamId")
	private List<Streams> streams;

}