package com.winpoint.model;

import java.util.Date;
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
public class SecurityQuestions {
//	checked
	@Id
	private Integer securityQuestionId;
	private String securityQuestion;
	private Integer createdBy;
	private Date createdDate;
	

	@OneToMany(targetEntity = UserProfile.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "securityQuestionId", referencedColumnName = "securityQuestionId")
	private List<UserProfile> UserProfile;
	
	//////////////////////

}