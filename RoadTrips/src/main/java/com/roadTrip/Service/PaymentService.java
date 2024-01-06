package com.roadTrip.Service;

import com.roadTrip.Entities.Payment;

public interface PaymentService {
	Payment getPaymentById(int passengerId );
	Payment addPayment(Payment payment);
	Payment updateDb(int PassengerId,Payment payment);
	void deleteDb(int PassengerId);

}
