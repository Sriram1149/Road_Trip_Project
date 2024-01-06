package com.roadTrip.ServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roadTrip.Entities.User;
import com.roadTrip.Repository.UserRepo;
import com.roadTrip.Service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserRepo userRepo;

	@Override
	public User getPassengerById(int id ) {
		Optional<User> pay=Optional.ofNullable(userRepo.findById(id));

		User p;
		if(pay.isPresent())
       {

			 p=pay.get();

		}

else {

			throw new ResourceNotFoundException();

		}

		return p;

}

	@Override
	public User addPassenger(User user) {
		return  userRepo.save(user);
	}

	@Override
	public User updateDb(int id, User user) {
	User s1 = userRepo.findById(id);

		if(s1!=null) {
			s1.setFirstName(user.getFirstName());   
			s1.setLastName(user.getLastName());
			s1.setEmail(user.getEmail());
			s1.setPassword(user.getPassword());
			s1.setPhoneNumber(user.getPhoneNumber());

		return userRepo.save(s1);
		} 
		else 
		{
			throw new ResourceNotFoundException();
		} 
	}

	@Override
	public void deleteDb(int id) {


		User s2 = userRepo.findById(id);

		if(s2!=null) {
			userRepo.delete(s2);
		}
		else {
			throw new ResourceNotFoundException();
		}		 




}


}
