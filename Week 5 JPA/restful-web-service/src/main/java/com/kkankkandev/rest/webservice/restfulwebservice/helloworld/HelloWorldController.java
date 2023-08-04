package com.kkankkandev.rest.webservice.restfulwebservice.helloworld;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
 //	@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
//	public String helloWorld() {
//		return "Hello World!";
//	}

	@GetMapping(path = "/hello-world")
	public String helloWorld2() {
		return "Hello World!";
	}

	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World [changed]");
	}

	// Path Parameters
	// /users/{id}/todos/{id} => /users/2/todos/200
	// /hello-world/path-variable/{name}
	// /hello-world/path-variable/Ranga
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World %s", name));
	}
}