package com.example.repository;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class TimeSlots {
//	checked 
	@Id
	private Integer timeSlotsId;
	private String timeSlotsDescription;
	
//	@ManyToOne(targetEntity = TimeSlots.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "timeSlotsId", referencedColumnName = "timeSlotsId")
//	private List<TimeSlots> timeSlots;	

}
