package com.smartprocess.smcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartprocess.smcrud.entities.Client;


public interface ClientRepository extends JpaRepository<Client, Long> {

}
