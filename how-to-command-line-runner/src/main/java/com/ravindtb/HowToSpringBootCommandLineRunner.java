package com.ravindtb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HowToSpringBootCommandLineRunner implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(HowToSpringBootCommandLineRunner.class);

	public static void main(String... args) {
		logger.info("Starting How to CommandLineRunner Spring Boot Application");
		SpringApplication.run(HowToSpringBootCommandLineRunner.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("This method is called just before SpringApplication.run() completes.");
		logger.info("It is called after all beans are initilized and application context is ready");
	}

}
