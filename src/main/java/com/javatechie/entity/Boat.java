package com.javatechie.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Boat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long boatId;
	private long ownerId;
	private String boatName;
	private long sourceghatId;
	private String contact;
	private String capacity;
	private String boatType;
}
