package com.proyecto.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PracticaVentaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticaVentaApplication.class, args);
	}

}
