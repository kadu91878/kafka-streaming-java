package com.example.kafkastreaming.kafkastreaming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.kafkastreaming")
@RestController
public class KafkastreamingApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkastreamingApplication.class, args);
	}

	 @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

}
