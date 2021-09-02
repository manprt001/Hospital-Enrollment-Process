package com.camunda.hospital.client.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name="client")
@AllArgsConstructor
@Data
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long clientId;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	private Date DOB;
	private String insurance;
}
