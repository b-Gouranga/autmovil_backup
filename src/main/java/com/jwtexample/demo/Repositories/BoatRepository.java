package com.jwtexample.demo.Repositories;

import com.jwtexample.demo.entities.Boat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoatRepository extends JpaRepository<Boat,Long> {
}
