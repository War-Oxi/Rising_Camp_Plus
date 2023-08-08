package com.kkankkandev.rest.webservice.restfulwebservice.user;

import com.kkankkandev.rest.webservice.restfulwebservice.jpa.PostRepository;
import com.kkankkandev.rest.webservice.restfulwebservice.jpa.UserRepository;
import jakarta.validation.Valid;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class UserJpaResources {

	private final UserRepository userRepository;
	private final PostRepository postRepository;
	public UserJpaResources(UserRepository repository,PostRepository postRepository) {
		this.userRepository = repository;
		this.postRepository = postRepository;
	}


	//GET /users
	@GetMapping("/jpa/users")
	public List<User> retrieveAllUsers() {
		return userRepository.findAll();
	}

	//EntityModel
	//WebMvcLinkBuilder
	@GetMapping("/jpa/users/{id}")
	public EntityModel<User> retrieveUser(@PathVariable int id) {
		Optional<User> user = userRepository.findById(id);

		if(user.isEmpty())
			throw new UserNotFoundException("id :" + id);

		EntityModel<User> entityModel = EntityModel.of(user.get());

		WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).retrieveAllUsers());
		entityModel.add(link.withRel("all-users"));

		return entityModel;
	}

	@PostMapping("/jpa/users")
	public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
		User savedUser = userRepository.save(user);

		// /users/4 => /users/{id}, user.getId
		URI location = ServletUriComponentsBuilder
			.fromCurrentContextPath()
			.path("/{id}")
			.buildAndExpand(savedUser.getId())
			.toUri();
		return ResponseEntity.created(location).build();
	}

//	@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
	@DeleteMapping("/jpa/users/{id}")
	public void deleteUser(@PathVariable int id) {
		userRepository.deleteById(id);
	}

	@DeleteMapping("jpa/users/{user_id}/{post_id}")
	public void deletePostForUser(@PathVariable int post_id) {
		postRepository.deleteById(post_id);
	}

	@PostMapping("/jpa/users/{id}/posts")
	public ResponseEntity<Post> createPostForUser(@PathVariable int id, @Valid @RequestBody Post post) {
		Optional<User> user = userRepository.findById(id);

		if(user.isEmpty())
			throw new UserNotFoundException("id : " + id);

		post.setUser(user.get());

		Post savedPost = postRepository.save(post);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
			.path("/{id}")
			.buildAndExpand(savedPost.getId())
			.toUri();

		return ResponseEntity.created(location).build();
	}

	@GetMapping("/jpa/users/{id}/posts")
	public List<Post> retrievePostsForUser(@PathVariable int id) {
		Optional<User> user = userRepository.findById(id);

		if(user.isEmpty())
			throw new UserNotFoundException("id : " + id);

		return user.get().getPosts();
	}


}
