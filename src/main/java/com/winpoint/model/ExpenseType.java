package com.winpoint.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class ExpenseType {
//	checked
	@Id
	@GeneratedValue
	private Integer expenseTypeId;
	private String expenseTypeName;
	
	@ManyToOne(targetEntity = ExpenseType.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "expenseTypeId", referencedColumnName = "expenseTypeId")
	private List<ExpenseType> expenseType;
}
