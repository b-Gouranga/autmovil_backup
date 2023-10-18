package com.jwtexample.demo.Service;

import com.jwtexample.demo.Repositories.BoatRepository;
import com.jwtexample.demo.entities.Boat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoatService {

    @Autowired
    private BoatRepository boatRepository;


    public List<Boat> getBoat() {
        return this.boatRepository.findAll();
    }


    public Boat addBoat(Boat newboat) {
        boatRepository.save(newboat);
        return newboat;
    }

}
