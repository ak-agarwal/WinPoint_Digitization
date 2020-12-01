package com.winpoint.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class ExpenseType {
//	checked
	@Id
	private Integer expenseTypeId;
	private String expenseTypeName;
	
	
	
	@OneToMany(targetEntity = ExpenseDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "expenseTypeId", referencedColumnName = "expenseTypeId")
	private List<ExpenseDetails> ExpenseDetails;

	
	///////////////////

}
