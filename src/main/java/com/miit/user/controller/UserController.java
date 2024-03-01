package com.miit.user.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.miit.user.entites.User;
import com.miit.user.services.UserServices;

/**
 * @author Miit Tech
 *
 */
@RestController
public class UserController {

	@Autowired
	UserServices userService;

	@GetMapping("/")
	public List<User> getusers() {
		return userService.getUsers();
	}

	@GetMapping("/user/{id}")
	public User getByID(@PathVariable(required = true) long id) {
//		Get Id from DB via Cache
		return userService.getUserById(id);
	}

	@PostMapping("/user/add")
	public User postUser(@RequestBody User user) {
		userService.add(user);
		return user;
	}

	@DeleteMapping("/user/{id}")
	public void delete(@PathVariable(required = true) long id) {
		userService.delete(id);
	}

	@PutMapping("/user/{id}")
	public User update(@RequestBody User user, @PathVariable(required = true) long id) {
		
		return userService.updateUser(user, id);

	}
}
