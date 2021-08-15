package com.digitalinnovationone.springboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AppController {

	@Value("${app.message}")
	private String appMessage;
	
	@Value("${ENV_DB_URL:NENHUMA}")
	private String dbEnvironmentVariable;
	
	
	@GetMapping("/message")
	public String getAppMessage() {
		return appMessage;
	}
	
	@GetMapping("/envMessage")
	public String getEnvironmentVariable() {
		return "A seguinte variavel de ambiente foi passada :" + dbEnvironmentVariable;
	}
	
}
