package com.jwtexample.demo.Controllers;

import com.jwtexample.demo.Service.BoatService;
import com.jwtexample.demo.entities.Boat;
import com.jwtexample.demo.entities.User;
import com.jwtexample.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private UserService userService;

    @Autowired
    private BoatService boatService;

    @GetMapping("/user")
    public List<User> getUser()
    {
        System.out.println("getting user");
        return userService.getUsers();

    }

//    @GetMapping("/current_user")
//    public String getLoggedInUser(Principal principal){
//        return principal.getName();
//    }


    //boat
    @GetMapping("/boat")
    public List<Boat> getBoat()
    {
        return this.boatService.getBoat();
    }

    @PostMapping(path="/new_boat",consumes= "application/json")
    public Boat addBoat(@RequestBody Boat newboat)
    {
        return this.boatService.addBoat(newboat);
    }

    @GetMapping("/current_user")
    public UserDetails getCurrentUserDetails(Authentication authentication) {
        if (authentication != null) {
            return (UserDetails) userDetailsService.loadUserByUsername(authentication.getName());
        }
        return null; // Handle the case when no user is authenticated
    }
//    @GetMapping("/current_username")
//    public String getLoggedInUser(Principal principal){
//
//        return principal.getName();
//
//    }

}
