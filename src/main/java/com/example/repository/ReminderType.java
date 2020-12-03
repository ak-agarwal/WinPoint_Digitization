package com.example.repository;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ReminderType {
//	checked
	@Id
	private Integer reminderTypeId;
	private String reminderTypeCategory;
	
//	@ManyToOne(targetEntity = ReminderType.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "reminderTypeId", referencedColumnName = "reminderTypeId")
//	private List<ReminderType> reminderType;

}
