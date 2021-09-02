package com.camunda.hospital.client.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.camunda.hospital.client.models.Client;
import com.camunda.hospital.client.service.ClientService;

@RestController
@RequestMapping("client")
public class ClientController {

	@Autowired
	ClientService service;
	
	@GetMapping("/all")
	public List<Client> getAllClients(){
		return service.findAll();
	}
	@PostMapping("/add")
	public Client addClient(@RequestBody Client client) {
		return service.add(client);
	}
	@GetMapping("/client-id/{id}")
	public Optional<Client> getClientById(@PathVariable("id") Long id) {
		return service.findById(id);
	}
}
