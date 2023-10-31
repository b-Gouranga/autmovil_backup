package com.jwtexample.demo.Service;

import com.jwtexample.demo.Repositories.BoatPriceRepository;
import com.jwtexample.demo.entities.BoatPrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoatPriceService {

    @Autowired
    BoatPriceRepository boatPriceRepository;

    public List<BoatPrice> getPrice() {
        return boatPriceRepository.findAll();
    }

    public BoatPrice addBoatPrice(BoatPrice newprice) {
        boatPriceRepository.save(newprice);
        return newprice;
    }


}
