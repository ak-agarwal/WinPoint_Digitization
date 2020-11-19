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
public class Rules {
//	checked
	@Id
	private Integer rulesId;
	private String rulesDescription;
	private Integer createdBy;
	private Date createdDate;
	
	@ManyToOne(targetEntity = Rules.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "rulesId", referencedColumnName = "rulesId")
	private List<Rules> rules;

	
}
