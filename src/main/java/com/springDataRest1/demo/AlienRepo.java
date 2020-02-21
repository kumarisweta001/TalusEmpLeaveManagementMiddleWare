package com.springDataRest1.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springDataRest1.demo.modal.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer> {
	
}
