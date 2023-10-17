package com.javatechie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechie.entity.Boat;
import com.javatechie.repository.BoatRepository;

@Service
public class BoatService {

	@Autowired
	private BoatRepository boatRepository;
	
	
	public List<Boat> getBoat() {
		
		return boatRepository.findAll();
	}
	
	 public String addBoat(Boat newboat) {
	        boatRepository.save(newboat);
	        return "new  boat added to system ";
	    }
}
