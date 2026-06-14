package com.example.todo_spring_notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAsync
@EnableScheduling
@SpringBootApplication
public class TodoSpringNotificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoSpringNotificationApplication.class, args);
	}

}
