package com.training.test_unit_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	//expose student Service Bean
	@Bean
	public StudentService getStudentService() {
		return new StudentServiceImpl();
	}
}
