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
public class Boat {
    @Id
    private long boatId;
    private long ownerId;
    private String boatName;
    private long sourceGhatId;
    private String contact;
    private String capacity;
    private String boatType;
}
