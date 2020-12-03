package com.winpoint.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Room {
//	checked
	@Id
	private Integer roomId;
	private Integer roomCapacity;
	private Boolean roomAvailable;
	
	@ManyToOne(targetEntity = Room.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "roomId", referencedColumnName = "roomId")
	private List<Room> room;

}