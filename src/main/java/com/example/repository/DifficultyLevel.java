package com.example.repository;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

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
	
//	@OneToMany(targetEntity = DifficultyLevel.class,  cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "difficultyLevelId", referencedColumnName = "difficultyLevelId")
//	private List<DifficultyLevel> difficultyLevel;
	
	
}
