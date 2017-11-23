package br.com.pdv.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class PdvApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PdvApiApplication.class, args);
	}
}
