package io.pivotal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AttendeeServiceApplication {
	//Trigger Concourse Pipeline
	public static void main(String[] args) {
		SpringApplication.run(AttendeeServiceApplication.class, args);
	}
}
