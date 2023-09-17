package com.app.clientcontrolback.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.clientcontrolback.interfaces.IClientService;
import com.app.clientcontrolback.dao.ClientDao;
import com.app.clientcontrolback.models.Client;

@Service
public class ClientService implements IClientService {
	
	@Autowired
	private ClientDao clientDao;
	
	public static final Logger LOGGER = Logger.getLogger(ClientService.class.getName());

	@Override
	@Transactional(readOnly = true)
	public List<Client> listClient() {
		return (List<Client>) this.clientDao.findAll();
	}

	@Override
	@Transactional
	public String saveClient(Client client) {
		String response = "";
		
		try {
			ClientService.LOGGER.info("Processing Client data to save.");
			this.clientDao.save(client);
			response = "OK";
			
		} catch(Exception e) {
			ClientService.LOGGER.warning("Error!! processing Client data to save: " + e);
			response = "ERROR";
		}
		
		return response;
	}

	@Override
	@Transactional
	public String deleteClient(Integer id) {
		String response = "";
		
		try {
			ClientService.LOGGER.info("Processing Client data to delete.");
			
			this.clientDao.deleteById(id);
			response = "OK";
			
		} catch(Exception e) {
			ClientService.LOGGER.warning("Error!! processing Client data to delete: " + e);
			response = "ERROR";
		}
		
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public Client getById(Integer id) {
		String response = "";
		
		try {		
			this.clientDao.findById(id);
			response = "OK";
			
		} catch(Exception e) {
			ClientService.LOGGER.warning("Error!! processing Client data to getById: " + e);
			response = "ERROR";
		}
		
		return null;
	}
	
	

}
