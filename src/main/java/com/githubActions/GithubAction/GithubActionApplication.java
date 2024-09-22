package com.githubActions.GithubAction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionApplication extends SpringBootServletInitializer{

	@GetMapping("/happy")
	public String happy() {
		return "Happinesss";
	}
	
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
