package com.winpoint.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class TimeSlots {
//	checked 
	@Id
	private Integer timeSlotsId;
	private String timeSlotsDescription;
		

}
