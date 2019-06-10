package io.spring.cloud.samples.fortuneteller.ui.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "bean")
public class UIConfig {
	
	 private String message = "Message from backend is: %s <br/> Services : %s";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}

