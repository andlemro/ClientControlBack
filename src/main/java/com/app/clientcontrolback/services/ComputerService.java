package com.app.clientcontrolback.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.clientcontrolback.interfaces.IComputerRepo;
import com.app.clientcontrolback.interfaces.IComputerService;
import com.app.clientcontrolback.models.Computer;

@Service
public class ComputerService implements IComputerService {
	
	@Autowired
	private IComputerRepo repo;
	
	public static final Logger LOGGER = Logger.getLogger(ComputerService.class.getName());

	@Override
	public List<Computer> listComputers() {
		return this.repo.findAll();
	}

	@Override
	public String createComputer(Computer computer) {
		String response = "";
		
		try {
			ComputerService.LOGGER.info("Processing Computer data to save.");
			this.repo.save(computer);
			response = "OK";
			
		} catch(Exception e) {
			ComputerService.LOGGER.warning("Error!! processing Computer data to save: " + e);
			response = "ERROR";
		}
		
		return response;
	}

	@Override
	public String editComputer(Computer computer) {
		String response = "";
		
		try {
			ComputerService.LOGGER.info("Processing Computer data to edit.");
			
			this.repo.save(computer);
			response = "OK";
			
		} catch(Exception e) {
			ComputerService.LOGGER.warning("Error!! processing Computer data to edit: " + e);
			response = "ERROR";
		}
		
		return response;
	}

	@Override
	public String deleteComputer(Integer id) {
		String response = "";
		
		try {
			ComputerService.LOGGER.info("Processing Computer data to delete.");
			
			this.repo.deleteById(id);
			response = "OK";
			
		} catch(Exception e) {
			ComputerService.LOGGER.warning("Error!! processing Computer data to delete: " + e);
			response = "ERROR";
		}
		
		return null;
	}
	
	

}
