package com.ravindtb.banner;

import java.io.PrintStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.core.env.Environment;


public class ApplicationBanner implements Banner {

	private static final Logger logger = LoggerFactory.getLogger(ApplicationBanner.class);

	@Override
	public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
		logger.info("Inoked pringBanner method");

	}

}
