package com.camunda.hospital.enrollment.dao;

import java.sql.Date;

import lombok.Data;


@Data
public class Client {
	//Data Access Object -> to save from JSON To Java before sending it to Client-Service Microservice
	
	private String firstName;
	private String lastName;
	private String DOB;
	private String insurance;
}
