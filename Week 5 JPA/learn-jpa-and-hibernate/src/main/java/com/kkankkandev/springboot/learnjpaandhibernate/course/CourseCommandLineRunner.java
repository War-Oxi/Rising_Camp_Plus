package com.kkankkandev.springboot.learnjpaandhibernate.course;

import com.kkankkandev.springboot.learnjpaandhibernate.course.jpa.Course;
import com.kkankkandev.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.kkankkandev.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CourseJdbcRepository repository;

//	@Autowired
//	private CourseJpaRepository repository;

	@Autowired
	private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1l, "Learn AWS SpringJPA", "kkankkandev"));
		repository.save(new Course(2, "Learn Azure SpringJPA", "kkankkandev2"));
		repository.save(new Course(3, "Learn SpringJPA", "kkankkandev"));

		repository.deleteById(1l);

		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));

		System.out.println(repository.count());
		System.out.println(repository.existsById(2l));

		System.out.println(repository.findAll());

		System.out.println(repository.findByAuthor("kkankkandev"));
		System.out.println(repository.findByName("Learn SpringJPA"));


//		repository.insert(new Course(1, "Learn AWS", "KKanKKanDev"));
//		repository.insert(new Course(2, "Learn Azure", "KKanKKanDev"));
//		repository.insert(new Course(3, "Learn DevOps", "KKanKKanDev"));
//		repository.insert(new Course(4, "Learn FullStack", "KKanKKanDev"));
//		repository.deleteById(1);
//		System.out.println(repository.findById(2));
//		System.out.println(repository.findById(3));
//		System.out.println(repository.selectAll());
	}
}
