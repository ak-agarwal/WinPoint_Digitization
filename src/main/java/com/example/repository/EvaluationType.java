package com.example.repository;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class EvaluationType {
//	checked
	@Id
	private Integer evaluationTypeId;
	private String evaluationTypeName;
	private String offlineCheck;
	private Integer createdBy;
	private Date createdDate;

//	@ManyToOne(targetEntity = EvaluationType.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "evaluationTypeId", referencedColumnName = "evaluationTypeId")
//	private List<EvaluationType> evaluationType;
	
}
