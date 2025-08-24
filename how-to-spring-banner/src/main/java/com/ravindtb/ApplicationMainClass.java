package com.ravindtb;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ravindtb.banner.ApplicationBanner;

@SpringBootApplication
public class ApplicationMainClass {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationMainClass.class, args);

	}

	public static void main(String[] args, String secondMain) {
		Banner applicationBanner = new ApplicationBanner();
		SpringApplication springApplication = new SpringApplication(ApplicationMainClass.class);

		springApplication.setBanner(applicationBanner);
		springApplication.run(args);

	}
}
