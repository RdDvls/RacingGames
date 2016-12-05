package com.TIY;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class RacingGameApplicationTests {
    @Autowired
    UserRepository users;
    @Autowired
    CarRepository cars;

	@Test
	public void contextLoads() {
	}


	@Test
    public void testInsertUser(){
        try {
            Users testUser = new Users("TestFirstName", "TestLastName", "TestUserName", "TestPassword");
            users.save(testUser);
            assertTrue(users.count() == 1);
            assertEquals(testUser.firstName, users.findByUsername("TestUserName").getFirstName());
        }finally{
            users.deleteAll();
            assertEquals(0, users.count());
        }
    }
    @Test
    public void testRetrieveUser(){
        try{
            Users testUser = new Users("TestFirstName", "TestLastName", "TestUserName", "TestPassword");
            users.save(testUser);
            assertEquals(testUser.firstName, users.findByUsername("TestUserName").getFirstName());
            assertEquals(testUser.lastName, users.findByUsername("TestUserName").getLastName());
            assertEquals(testUser.username, users.findByUsername("TestUserName").getUsername());
            assertEquals(testUser.password, users.findByUsername("TestUserName").getPassword());
    }finally{
            users.deleteAll();
            assertEquals(0, cars.count());
        }

    }


    @Test
    public void testConstructAndInsertCar(){
        try{
            Cars testCar = new Cars("TestCarMake", "TestCarModel", "TestCarColor", 0,"TestCarName");
            cars.save(testCar);
            assertTrue(cars.count() == 1);
            assertEquals("TestCarModel", cars.findByCarName("TestCarName").getCarModel());

    }finally{
            cars.deleteAll();
            assertEquals(0, cars.count());
        }
    }

    @Test
    public void testRetrieveCar() {
        try {
            Cars testCar = new Cars("TestCarMake", "TestCarModel", "TestCarColor", 0, "TestCarName");
            cars.save(testCar);
            Cars retrievedCar = new Cars(cars.findByCarName("TestCarName").carMake, cars.findByCarName("TestCarName").carModel, cars.findByCarName("TestCarName").carColor, cars.findByCarName("TestCarName").carSpeed, cars.findByCarName("TestCarName").carName);
            assertEquals(retrievedCar.carMake, cars.findByCarName("TestCarName").getCarMake());
            assertEquals(retrievedCar.carModel, cars.findByCarName("TestCarName").getCarModel());
            assertEquals(retrievedCar.carColor, cars.findByCarName("TestCarName").getCarColor());
            assertEquals(retrievedCar.carSpeed, cars.findByCarName("TestCarName").getCarSpeed());
            assertEquals(retrievedCar.carName, cars.findByCarName("TestCarName").getCarName());
            System.out.println(retrievedCar.carMake);
        } finally {
            cars.deleteAll();
            assertEquals(0, cars.count());
        }
    }
}
