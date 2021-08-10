package com.camunda.hospital.service;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableProcessApplication
public class CamundaHospitalServiceApplication {
	public static void main(String... args) {
		SpringApplication.run(CamundaHospitalServiceApplication.class, args);
	}
}
