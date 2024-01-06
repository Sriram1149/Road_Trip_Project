package com.roadTrip.Service;

import com.roadTrip.Entities.User;

public interface UserService {
	User getPassengerById(int id );
	User addPassenger(User user);
	User updateDb(int pid, User user);
	void deleteDb(int id);

}
