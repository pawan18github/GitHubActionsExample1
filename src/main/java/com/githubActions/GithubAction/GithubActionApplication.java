package com.githubActions.GithubAction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class GithubActionApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(GithubActionApplication.class, args);
		System.out.println("Hello World !!");
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(GithubActionApplication.class);
	}

}
