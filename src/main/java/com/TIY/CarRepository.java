package com.TIY;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by RdDvls on 12/2/16.
 */
public interface CarRepository extends CrudRepository <Cars, Integer>{
    Cars findById(int id);
}
