package com.elda.primeravez;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Principal {

	public static void main(String[] args) {

		SpringApplication.run(Principal.class, args);

	}

}
