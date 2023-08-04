package com.kkankkandev.rest.webservice.restfulwebservice.user;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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
		User user = service.findOne(id);

		if(user == null)
			throw new UserNotFoundException("id :" + id);

		return user;
	}

	@PostMapping("/users")
	public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
		User savedUser = service.save(user);

		// /users/4 => /users/{id}, user.getId
		URI location = ServletUriComponentsBuilder
			.fromCurrentContextPath()
			.path("/{id}")
			.buildAndExpand(savedUser.getId())
			.toUri();

		return ResponseEntity.created(location).build();
	}

//	@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id) {
		service.deleteById(id);
	}
}
