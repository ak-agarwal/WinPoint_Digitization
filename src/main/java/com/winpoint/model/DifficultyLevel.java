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
//checked
@Entity
@Data
public class DifficultyLevel {
	@Id
	private Integer difficultyLevelId;
	private String difficultyLevelName;
	private Integer createdBy;
	private Date createdDate;
	
	@OneToMany(targetEntity = DifficultyLevel.class,  cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "difficultyLevelId", referencedColumnName = "difficultyLevelId")
	private List<DifficultyLevel> difficultyLevel;
	
	
}
