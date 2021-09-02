package com.camunda.hospital.client.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.camunda.hospital.client.models.Client;
import com.camunda.hospital.client.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	ClientRepository repository;
	

	public List<Client> findAll() {
		
		return repository.findAll();
	}

	public Client add(Client client) {
		// TODO Auto-generated method stub
		return repository.save(client);
	}

	public Optional<Client> findById(Long id) {
		// TODO Auto-generated method stub
		
		return repository.findById(id);
	}

}
