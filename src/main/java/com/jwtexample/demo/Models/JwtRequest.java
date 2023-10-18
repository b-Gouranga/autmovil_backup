package com.jwtexample.demo.Models;


import lombok.*;
//import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class JwtRequest {

    private String email;
    private String password;

}
