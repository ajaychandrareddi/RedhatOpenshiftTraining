package com.redhat.openshift.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainingApplication.class, args);
	}

	@GetMapping(value ="/{name}")
	public String sayHello(@PathVariable("name") String name) {
		return "Hello " +name + ".! Welcome to Openshift Training. Have Fun :-)";
	}

}
