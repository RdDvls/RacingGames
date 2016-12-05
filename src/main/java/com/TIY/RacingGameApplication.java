package com.TIY;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class RacingGameApplication {
	@Autowired
	DriverRepository drivers;


	public static void main(String[] args) {
		SpringApplication.run(RacingGameApplication.class, args);
	}
	@PostConstruct
	public void init(){
		if(drivers.count() == 0){
			Drivers driverKato = new Drivers("Kato",null, "Human");
			drivers.save(driverKato);
		}
	}
}
