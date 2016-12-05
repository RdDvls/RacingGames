package com.TIY;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by RdDvls on 12/2/16.
 */
public interface UserRepository extends CrudRepository <Users,Integer> {
    Users findByUsername(String username);
}
