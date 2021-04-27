package com.app.clientcontrolback.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.clientcontrolback.interfaces.IClientService;
import com.app.clientcontrolback.interfaces.IClientRepo;
import com.app.clientcontrolback.models.Client;

@Service
public class ClientService implements IClientService {
	
	@Autowired
	private IClientRepo repo;
	
	public static final Logger LOGGER = Logger.getLogger(ClientService.class.getName());

	@Override
	public List<Client> listClient() {
		return this.repo.findAll();
	}

	@Override
	public String createClient(Client client) {
		String response = "";
		
		try {
			ClientService.LOGGER.info("Processing Client data to save.");
			this.repo.save(client);
			response = "OK";
			
		} catch(Exception e) {
			ClientService.LOGGER.warning("Error!! processing Client data to save: " + e);
			response = "ERROR";
		}
		
		return response;
	}

	@Override
	public String editClient(Client client) {
		String response = "";
		
		try {
			ClientService.LOGGER.info("Processing Client data to edit.");
			
			this.repo.save(client);
			response = "OK";
			
		} catch(Exception e) {
			ClientService.LOGGER.warning("Error!! processing Client data to edit: " + e);
			response = "ERROR";
		}
		
		return response;
	}

	@Override
	public String deleteClient(Integer id) {
		String response = "";
		
		try {
			ClientService.LOGGER.info("Processing Client data to delete.");
			
			this.repo.deleteById(id);
			response = "OK";
			
		} catch(Exception e) {
			ClientService.LOGGER.warning("Error!! processing Client data to delete: " + e);
			response = "ERROR";
		}
		
		return null;
	}
	
	

}
