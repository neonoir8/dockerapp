package ru.almaz.hwdockerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class HwdockerappApplication {

	public static void main(String[] args) {
		SpringApplication.run(HwdockerappApplication.class, args);
	}

}
