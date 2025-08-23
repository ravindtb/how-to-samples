package com.ravindtb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ApplicationMainClass implements ApplicationContextAware, ApplicationListener<ApplicationEvent> {

	private static final Logger logger = LoggerFactory.getLogger(ApplicationMainClass.class);

	private ApplicationContext appCtx;

	public static void main(String[] args) {
		logger.info("Starting Spring BeanLifecycle Spring Boot Application.");
		SpringApplication.run(ApplicationMainClass.class, args);

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		logger.info("Setting appilcationContext");
		this.appCtx = applicationContext;
	}

	@Override
	public void onApplicationEvent(ApplicationEvent event) {

		if (event instanceof ApplicationStartedEvent) {
			applicationStarted();
		}
	}

	private void applicationStarted() {
		logger.info(
				"The appication has started. Manually closing closing the applicationContext to check bean lifecycle methods");
		assert this.appCtx instanceof ConfigurableApplicationContext;
		ConfigurableApplicationContext configurableApplicationContext = (ConfigurableApplicationContext) this.appCtx;
		configurableApplicationContext.close();
	}

	@Override
	public boolean supportsAsyncExecution() {
		return false;
	}

}
