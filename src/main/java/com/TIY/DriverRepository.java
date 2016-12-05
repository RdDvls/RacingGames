package com.TIY;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by RdDvls on 12/5/16.
 */
public interface DriverRepository extends CrudRepository<Drivers, Integer>{
    public Drivers findByDriverFirstName(String driverFirstName);
}
