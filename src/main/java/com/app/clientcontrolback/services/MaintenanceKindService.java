package com.app.clientcontrolback.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.clientcontrolback.interfaces.IMaintenanceKindRepo;
import com.app.clientcontrolback.interfaces.IMaintenanceKindService;
import com.app.clientcontrolback.models.MaintenanceKind;

@Service
public class MaintenanceKindService implements IMaintenanceKindService {
	
	@Autowired
	private IMaintenanceKindRepo repo;
	
	public static final Logger LOGGER = Logger.getLogger(MaintenanceKindService.class.getName());

	@Override
	public List<MaintenanceKind> listMaintenanceKind() {
		return this.repo.findAll();
	}

	@Override
	public String createMaintenanceKind(MaintenanceKind maintenanceKind) {
		String response = "";
		
		try {
			MaintenanceKindService.LOGGER.info("Processing MaintenanceKind data to save.");
			this.repo.save(maintenanceKind);
			response = "OK";
			
		} catch(Exception e) {
			MaintenanceKindService.LOGGER.warning("Error!! processing MaintenanceKind data to save: " + e);
			response = "ERROR";
		}
		
		return response;
	}

	@Override
	public String editMaintenanceKind(MaintenanceKind maintenanceKind) {
		String response = "";
		
		try {
			MaintenanceKindService.LOGGER.info("Processing MaintenanceKind data to edit.");
			
			this.repo.save(maintenanceKind);
			response = "OK";
			
		} catch(Exception e) {
			MaintenanceKindService.LOGGER.warning("Error!! processing MaintenanceKind data to edit: " + e);
			response = "ERROR";
		}
		
		return response;
	}

	@Override
	public String deleteMaintenanceKind(Integer id) {
		String response = "";
		
		try {
			MaintenanceKindService.LOGGER.info("Processing MaintenanceKind data to delete.");
			
			this.repo.deleteById(id);
			response = "OK";
			
		} catch(Exception e) {
			MaintenanceKindService.LOGGER.warning("Error!! processing MaintenanceKind data to delete: " + e);
			response = "ERROR";
		}
		
		return null;
	}

}
