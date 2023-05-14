package com.thinkhack.geopolis.msbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MsBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsBankApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "GeoPolis API - Bank Microservices - v0.1";
	}
}
