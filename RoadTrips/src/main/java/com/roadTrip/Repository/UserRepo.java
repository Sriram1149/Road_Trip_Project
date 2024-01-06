package com.roadTrip.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.roadTrip.Entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	@Query(value =  "select * from Passenger where Id =?" , nativeQuery = true)
	User findById(int id);


}
