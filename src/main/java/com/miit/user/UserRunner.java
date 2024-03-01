package com.miit.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.miit.user.entites.User;
import com.miit.user.repo.UserRepository;

@Component
public class UserRunner implements CommandLineRunner {

	
	@Autowired
	UserRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		User user = new User("Keyur","kitchner");
		User user1 = new User("Dhruv","GTA");
		User user2 = new User("Devang","Windsor");
	
		User user3 = new User("Manpreet","Brampton");
		User user4 = new User("Manali","GTA");
		User user5 = new User("Kalgi","Windsor");
		
		
		List<User> list = new ArrayList<>();
		
		list.add(user);
		list.add(user1);
		list.add(user2);
		list.add(user3);
		list.add(user4);
		list.add(user5);
		
		
		repository.saveAll(list);
		
	}

	
	
}
