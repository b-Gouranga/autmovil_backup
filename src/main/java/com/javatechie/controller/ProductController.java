package com.javatechie.controller;

import com.javatechie.dto.Product;
import com.javatechie.entity.Boat;
import com.javatechie.entity.UserInfo;
import com.javatechie.service.BoatService;
//import com.javatechie.service.ProductService;
import com.javatechie.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private UserService service;

    @Autowired
    private BoatService boatservice;
    
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome this endpoint is not secure";
    }

    @PostMapping("/new")
    public String addNewUser(@RequestBody UserInfo userInfo){
        return service.addUser(userInfo);
    }
    
    @GetMapping("/alluser")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<UserInfo> getuser() {
        return service.getuser();
    }

    @GetMapping("/all")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<Product> getAllTheProducts() {
        return service.getProducts();
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public Product getProductById(@PathVariable int id) {
        return service.getProduct(id);
    }
    
   ///new boat 
    @PostMapping("/newboat")
    public String addBoat(@RequestBody Boat newboat){
        return boatservice.addBoat(newboat);
    }
    
    @GetMapping("/allboat")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<Boat> getBoat() {
        return boatservice.getBoat();
    }

    
}
