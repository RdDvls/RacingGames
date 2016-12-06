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
			Drivers driverMario = new Drivers("Mario", null, "Human");
			Drivers driverYoshi = new Drivers("Yoshi",null,"Dinosaur");
			Drivers driverDonkeyKong = new Drivers("Donkey", "Kong", "Primate");
			Drivers driverMissDaisy = new Drivers("Hoke", "Colbum", "Human");
			Drivers driverPope = new Drivers("Pope Francis", null,"Human");
			Drivers driverBender = new Drivers("Bender", "Rodriguez","Robot");
			Drivers driverFry = new Drivers("Philip", "Fry", "Human");
			Drivers driverLeela = new Drivers("Turanga","Leela", "Mutant");
			Drivers driverToonces = new Drivers("Toonces","The Driving Cat","Feline");
			Drivers driverJLSimpson = new Drivers("Jimmy Lee", "Simpson", "Human");
			Drivers driverTina = new Drivers("Tina", "Belcher", "Human");
			drivers.save(driverTina);
			drivers.save(driverKato);
			drivers.save(driverMario);
			drivers.save(driverYoshi);
			drivers.save(driverDonkeyKong);
			drivers.save(driverMissDaisy);
			drivers.save(driverPope);
			drivers.save(driverBender);
			drivers.save(driverFry);
			drivers.save(driverLeela);
			drivers.save(driverToonces);
			drivers.save(driverJLSimpson);
		}
	}
}
