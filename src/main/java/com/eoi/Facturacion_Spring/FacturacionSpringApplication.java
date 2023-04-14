package com.eoi.Facturacion_Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (exclude = {org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})
public class FacturacionSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FacturacionSpringApplication.class, args);
	}

}
