package com.smartprocess.smcrud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smartprocess.smcrud.dto.ClientDTO;
import com.smartprocess.smcrud.entities.Client;
import com.smartprocess.smcrud.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Client client = repository.findById(id).get();
		return new ClientDTO(client);
	}
}
