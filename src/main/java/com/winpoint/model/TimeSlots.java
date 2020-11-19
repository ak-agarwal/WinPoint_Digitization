package com.winpoint.model;

import lombok.Data;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
public class TimeSlots {
//	checked 
	@Id
	private Integer timeSlotsId;
	private String timeSlotsDescription;
	
	@ManyToOne(targetEntity = TimeSlots.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "timeSlotsId", referencedColumnName = "timeSlotsId")
	private List<TimeSlots> timeSlots;	

}
