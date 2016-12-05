package com.TIY;

import javax.persistence.*;


/**
 * Created by RdDvls on 12/2/16.
 */
@Entity
@Table
public class Cars {

    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String carMake;

    @Column(nullable = false)
    String carModel;

    @Column(nullable = false)
    String carColor;

    @Column
    int carSpeed;

    public Cars(String carMake, String carModel, String carColor, int carSpeed) {
        this.carMake = carMake;
        this.carModel = carModel;
        this.carColor = carColor;
        this.carSpeed = carSpeed;
    }

    public Cars() {
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getCarSpeed() {
        return carSpeed;
    }

    public void setCarSpeed(int carSpeed) {
        this.carSpeed = carSpeed;
    }
}
