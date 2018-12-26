package com.lobo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Melissa Lobo
 * Class with main method, responsible for starting the application
 * 
 */
@SpringBootApplication
@ComponentScan(basePackages="com.baeldung.camel")
public class Application {
    
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
