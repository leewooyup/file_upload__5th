package com.ll.exam.app0203;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class App0203Application {

	public static void main(String[] args) {
		SpringApplication.run(App0203Application.class, args);
	}

}
