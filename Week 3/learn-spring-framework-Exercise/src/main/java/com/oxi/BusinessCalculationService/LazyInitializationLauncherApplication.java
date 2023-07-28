package com.oxi.BusinessCalculationService;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA {
	ClassA(){
		System.out.println("ClassA Constructor Called");
	}
}

@Component
@Lazy
class ClassB {
	private ClassA classA;
	ClassB(ClassA classA){
		System.out.println("ClassB Constructor Called");
		this.classA = classA;
	}

	public void doSomething() {
		System.out.println("Do Something");
	}
}
@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {
	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)) {

			System.out.println("Initialization of context is completed");

			context.getBean(ClassB.class).doSomething();
//			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
//
//			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		}
	}
}
