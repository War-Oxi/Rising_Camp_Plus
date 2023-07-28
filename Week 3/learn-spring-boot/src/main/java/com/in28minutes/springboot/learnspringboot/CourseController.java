package com.in28minutes.springboot.learnspringboot;

// http://localhost:8080/courses
//[
//	{
//	"id": 1,
//	"name": "Learn AWS",
//	"author": "in28minutes"
//	}
//]



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

	//  Courses
	// Course: id, name, author
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses() {
		return Arrays.asList(
			new Course(1, "Learn AWS", "in28minutes"),
			new Course(2, "Learn Azure", "in28minutes"),
			new Course(3, "Learn DevOps ", "in28minutes"),
			new Course(4, "Learn NCP", "in28minutes"),
			new Course(5, "Learn Java", "in28minutes")
		);
	}

}
