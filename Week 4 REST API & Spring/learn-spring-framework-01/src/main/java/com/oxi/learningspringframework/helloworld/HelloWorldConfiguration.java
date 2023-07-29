package com.oxi.learningspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address) {};
record Address (String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "TaeJi";
	}

	@Bean
	public int age() {
		return 15;
	}

	@Bean
	public Person person() {
		return new Person("Ravi", 20, new Address("Main Street", "Utrecht"));
	}

	@Bean
	public Person person2MethodCall(){
		return new Person(name(), age(), address());
	}

	@Bean
	public Person person3Parameters(String name, int age, Address address2){
		//name, age, address2
		return new Person(name, age , address2);
	}

	@Bean
	@Primary
	public Person person4Parameters(String name, int age, Address address){
		//name, age, address2
		return new Person(name, age , address);
	}
	@Bean
	public Address address(){
		return new Address("남하길 177-1", "충청북도");
	}

	@Bean
	@Primary
	public Address address2(){
		return new Address("주소2 firstLine", "주소2");
	}
}
