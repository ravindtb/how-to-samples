package com.ravindtb.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class ABean implements InitializingBean, DisposableBean {

	private static final Logger logger = LoggerFactory.getLogger(ABean.class);

	@Override
	public void destroy() throws Exception {
		logger.info("This method is called during destruction of application context.");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		logger.info("This method is called during initilization of bean.");

	}

}
