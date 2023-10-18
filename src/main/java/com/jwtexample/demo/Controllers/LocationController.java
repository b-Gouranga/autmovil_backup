package com.jwtexample.demo.Controllers;

import com.jwtexample.demo.Service.GhatService;
import com.jwtexample.demo.entities.Ghat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/location")
public class LocationController {
    @Autowired
    private GhatService ghatService;

    @GetMapping("/ghat")
    public List<Ghat> getGhat()
    {
        return this.ghatService.getGhat();
    }

    @PostMapping(path="/new_ghat",consumes= "application/json")
    public Ghat addGhat(@RequestBody Ghat newghat)
    {
        return this.ghatService.addGhat(newghat);
    }

}
