package com.winpoint.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class TimeSlots {
//	checked 
	@Id
	private Integer timeSlotsId;
	private String timeSlotsDescription;
	
	
	@OneToMany(targetEntity = EnquiryDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "timeSlotsId", referencedColumnName = "timeSlotsId")
	private List<EnquiryDetails> EnquiryDetails;
	
	
	
	@OneToMany(targetEntity = UserProfile.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "timeSlotsId", referencedColumnName = "timeSlotsId")
	private List<UserProfile> UserProfile;
	
	
	
//////////////////////
}
