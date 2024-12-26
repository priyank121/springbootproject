package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerDemoApplication {

	public static void main(String[] args) {
		System.out.println("started");
		SpringApplication.run(DockerDemoApplication.class, args);
	}

}
