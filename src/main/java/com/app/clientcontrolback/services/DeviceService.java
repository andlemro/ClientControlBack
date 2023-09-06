package com.app.clientcontrolback.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.clientcontrolback.interfaces.IDeviceRepo;
import com.app.clientcontrolback.interfaces.IDeviceService;
import com.app.clientcontrolback.models.Device;

@Service
public class DeviceService implements IDeviceService {
	
	@Autowired
	private IDeviceRepo repo;
	
	public static final Logger LOGGER = Logger.getLogger(DeviceService.class.getName());

	@Override
	public List<Device> listDevices() {
		return this.repo.findAll();
	}

	@Override
	public String createDevice(Device computer) {
		String response = "";
		
		try {
			DeviceService.LOGGER.info("Processing Computer data to save.");
			this.repo.save(computer);
			response = "OK";
			
		} catch(Exception e) {
			DeviceService.LOGGER.warning("Error!! processing Computer data to save: " + e);
			response = "ERROR";
		}
		
		return response;
	}

	@Override
	public String editDevice(Device computer) {
		String response = "";
		
		try {
			DeviceService.LOGGER.info("Processing Computer data to edit.");
			
			this.repo.save(computer);
			response = "OK";
			
		} catch(Exception e) {
			DeviceService.LOGGER.warning("Error!! processing Computer data to edit: " + e);
			response = "ERROR";
		}
		
		return response;
	}

	@Override
	public String deleteDevice(Integer id) {
		String response = "";
		
		try {
			DeviceService.LOGGER.info("Processing Computer data to delete.");
			
			this.repo.deleteById(id);
			response = "OK";
			
		} catch(Exception e) {
			DeviceService.LOGGER.warning("Error!! processing Computer data to delete: " + e);
			response = "ERROR";
		}
		
		return null;
	}
	
	

}
