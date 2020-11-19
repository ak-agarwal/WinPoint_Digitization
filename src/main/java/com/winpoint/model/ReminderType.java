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
public class ReminderType {
//	checked
	@Id
	private Integer reminderTypeId;
	private String reminderTypeCategory;
	
	@ManyToOne(targetEntity = ReminderType.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "reminderTypeId", referencedColumnName = "reminderTypeId")
	private List<ReminderType> reminderType;

}
