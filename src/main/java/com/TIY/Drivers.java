package com.TIY;

import javax.annotation.PostConstruct;
import javax.persistence.*;

/**
 * Created by RdDvls on 12/5/16.
 */
@Entity
@Table
public class Drivers {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false,unique = true)
    String driverFirstName;

    @Column
    String driverLastName;

    @Column(nullable = false)
    String driverSpecies;



    public Drivers(String driverFirstName, String driverLastName, String driverSpecies) {
        this.driverFirstName = driverFirstName;
        this.driverLastName = driverLastName;
        this.driverSpecies = driverSpecies;
    }

    public Drivers() {
    }

    public String getDriverFirstName() {
        return driverFirstName;
    }

    public void setDriverFirstName(String driverFirstName) {
        this.driverFirstName = driverFirstName;
    }

    public String getDriverLastName() {
        return driverLastName;
    }

    public void setDriverLastName(String driverLastName) {
        this.driverLastName = driverLastName;
    }

    public String getDriverSpecies() {
        return driverSpecies;
    }

    public void setDriverSpecies(String driverSpecies) {
        this.driverSpecies = driverSpecies;
    }
}
