package com.jwtexample.demo.entities;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class BoatPrice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long boatPriceId ;
//    @ManyToOne
//    @JoinColumn(name = "boatId")
//    private Boat boatId;
    private long boatId;




//    @ManyToOne
//    @JoinColumn(name = "boatType", referencedColumnName = "boatType",insertable=false, updatable=false)
////    @Column(insertable=false, updatable=false)
//    private Boat boat;
//    private String boatType;
    private String tripType ;
    private long price_Per_Person;


}
