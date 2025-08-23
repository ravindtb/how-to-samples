package com.ravindtb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan
public class HowToSpringBootApplicationRunner implements ApplicationRunner {

	private static final Logger logger = LoggerFactory.getLogger(HowToSpringBootApplicationRunner.class);

	public static void main(String[] args) {
		logger.info("Starting How to ApplicationRunner Spring Boot application");
		SpringApplication.run(HowToSpringBootApplicationRunner.class, args);

	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		logger.info("This method is called just before SpringApplication.run() method completes.");
		logger.info(
				"This method is called after initialization of all beans. ApplicationContext is also ready to be used at this point.");
	}

}
