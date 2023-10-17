package com.javatechie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.entity.Boat;


public interface BoatRepository  extends JpaRepository<Boat , Long>{

}
