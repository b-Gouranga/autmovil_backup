package com.jwtexample.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Ghat {

    @Id
    private long ghatId ;
    private String location ;
    private String openTiming ;
    private String closeTiming ;
    private String latitude;
    private String longitude;
    private Boolean isOpen;
}
