package com.srnp.univ.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srnp.univ.model.Greeting;


@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Integer> {
	
	

}
