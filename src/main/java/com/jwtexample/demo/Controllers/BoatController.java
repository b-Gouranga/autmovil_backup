package com.jwtexample.demo.Controllers;

import com.jwtexample.demo.Service.BoatPriceService;
import com.jwtexample.demo.entities.BoatPrice;
import com.jwtexample.demo.entities.Ghat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boat")
public class BoatController {

    @Autowired
    private BoatPriceService boatPriceService;

    @GetMapping("/get_price")
    private List<BoatPrice> getPrice(){return this.boatPriceService.getPrice();}

    @PostMapping(path="/new_boat_price",consumes= "application/json")
    public BoatPrice addBoatPrice(@RequestBody BoatPrice newprice)
    {
        return this.boatPriceService.addBoatPrice(newprice);
    }



}
