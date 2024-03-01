package com.miit.user.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.miit.user.entites.User;
import com.miit.user.repo.UserRepository;


@Component
public class UserServices {

	@Autowired
	UserRepository userRepository;

	public User add(User user) {
		return userRepository.save(user);
	}

	public List<User> getUsers() {
		return (List<User>) userRepository.findAll();
	}

	public User getUserById(long id) {
		Optional<User> optionalUser = userRepository.findById(id);
		return optionalUser.orElseThrow(() -> new UserNotFoundException("Couldn't find a Dog with id: " + id));
	}

	public void delete(long id) {
		userRepository.deleteById(id);
	}

	public User updateUser(User user, long id) {
		user.setId(id);
		return userRepository.save(user);
	}
	
	
}
