package com.ravindtb.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CommonsRequestLoggingFilter;
import org.springframework.web.filter.ServletContextRequestLoggingFilter;

@Configuration
public class LoggingFilterConfig {

	@Bean
	CommonsRequestLoggingFilter commonsRequestLoggingFilter() {
		return new CommonsRequestLoggingFilter();
	}

	@Bean
	ServletContextRequestLoggingFilter servletContextRequestLoggingFilter() {
		return new ServletContextRequestLoggingFilter();
	}

}
