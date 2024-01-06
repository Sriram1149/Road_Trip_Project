package com.roadTrip.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.roadTrip.Entities.Payment;

@Repository
public interface PaymentRepo extends JpaRepository<Payment, Integer>{
	@Query(value =  "select * from Payment where passengerId =?" , nativeQuery = true)
	Payment findById(int passengerId);

}
