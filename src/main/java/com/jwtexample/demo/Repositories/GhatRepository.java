package com.jwtexample.demo.Repositories;

import com.jwtexample.demo.entities.Boat;
import com.jwtexample.demo.entities.Ghat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GhatRepository extends JpaRepository<Ghat,Long> {
}
