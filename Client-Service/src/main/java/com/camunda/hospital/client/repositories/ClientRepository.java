package com.camunda.hospital.client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camunda.hospital.client.models.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
