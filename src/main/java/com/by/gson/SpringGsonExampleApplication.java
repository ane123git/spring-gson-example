package com.by.gson;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;

@SpringBootApplication(exclude = {JacksonAutoConfiguration.class})
public class SpringGsonExampleApplication {

	static Logger logger = LoggerFactory.getLogger(SpringGsonExampleApplication.class);
	public static void main(String[] args) {

		SpringApplication.run(SpringGsonExampleApplication.class, args);
		logger.trace("A TRACE Message");
		logger.debug("A DEBUG Message");
		logger.info("An INFO Message");
		logger.warn("A WARN Message");
		logger.error("An ERROR Message");
	}

}
