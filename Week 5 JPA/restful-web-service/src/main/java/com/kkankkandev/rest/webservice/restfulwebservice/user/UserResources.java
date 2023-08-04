package com.kkankkandev.rest.webservice.restfulwebservice.user;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.function.Predicate;

@RestController
public class UserResources {

	private UserDaoService service;
	public UserResources(UserDaoService service) {
		this.service = service;
	}


	//GET /users
	@GetMapping("/users")
	public List<User> retrieveAllUsers() {
		return service.findAll();
	}

	@GetMapping("/users/{id}")
	public User retrieveUser(@PathVariable int id) {
		return service.findOne(id);
	}

	@PostMapping("/users")
	public void createUser(@RequestBody User user) {
		service.save(user);
	}
}
