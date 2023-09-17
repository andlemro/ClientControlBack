package com.app.clientcontrolback.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.clientcontrolback.dao.MaintenanceKindDao;
import com.app.clientcontrolback.interfaces.IMaintenanceKindService;
import com.app.clientcontrolback.models.MaintenanceKind;

@Service
public class MaintenanceKindService implements IMaintenanceKindService {
	
	@Autowired
	private MaintenanceKindDao maintenanceKindDao;
	
	public static final Logger LOGGER = Logger.getLogger(MaintenanceKindService.class.getName());

	@Override
	@Transactional(readOnly = true)
	public List<MaintenanceKind> listMaintenanceKind() {
		return (List<MaintenanceKind>) this.maintenanceKindDao.findAll();
	}

	@Override
	@Transactional
	public String saveMaintenanceKind(MaintenanceKind maintenanceKind) {
		String response = "";
		
		try {
			MaintenanceKindService.LOGGER.info("Processing MaintenanceKind data to save.");
			this.maintenanceKindDao.save(maintenanceKind);
			response = "OK";
			
		} catch(Exception e) {
			MaintenanceKindService.LOGGER.warning("Error!! processing MaintenanceKind data to save: " + e);
			response = "ERROR";
		}
		
		return response;
	}

	@Override
	@Transactional
	public String deleteMaintenanceKind(Integer id) {
		String response = "";
		
		try {
			MaintenanceKindService.LOGGER.info("Processing MaintenanceKind data to delete.");
			
			this.maintenanceKindDao.deleteById(id);
			response = "OK";
			
		} catch(Exception e) {
			MaintenanceKindService.LOGGER.warning("Error!! processing MaintenanceKind data to delete: " + e);
			response = "ERROR";
		}
		
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public MaintenanceKind getMaintenanceKindById(Integer id) {
		String response = "";
		
		try {
			this.maintenanceKindDao.findById(id);
			response = "OK";
			
		} catch(Exception e) {
			MaintenanceKindService.LOGGER.warning("Error!! processing MaintenanceKind data to delete: " + e);
			response = "ERROR";
		}
		
		return null;
	}

}
