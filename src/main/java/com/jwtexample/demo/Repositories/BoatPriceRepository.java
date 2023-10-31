package com.jwtexample.demo.Repositories;

import com.jwtexample.demo.entities.BoatPrice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoatPriceRepository extends JpaRepository<BoatPrice , Long> {
}
