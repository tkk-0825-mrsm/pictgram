package com.example.pictgram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin

@SpringBootApplication
//public class PictgramApplication {
public class PictgramApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(PictgramApplication.class, args);
	}
	
	@Override
	     protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	         return application.sources(PictgramApplication.class);
	     }

}
