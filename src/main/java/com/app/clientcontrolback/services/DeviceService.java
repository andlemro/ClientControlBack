package com.app.clientcontrolback.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.clientcontrolback.dao.DeviceDao;
import com.app.clientcontrolback.interfaces.IDeviceService;
import com.app.clientcontrolback.models.Device;

@Service
public class DeviceService implements IDeviceService {
	
	@Autowired
	private DeviceDao deviceDao;
	
	public static final Logger LOGGER = Logger.getLogger(DeviceService.class.getName());

	@Override
	@Transactional(readOnly = true)
	public List<Device> listDevices() {
		return (List<Device>) this.deviceDao.findAll();
	}

	@Override
	@Transactional
	public String saveDevice(Device computer) {
		String response = "";
		
		try {
			DeviceService.LOGGER.info("Processing Computer data to save.");
			this.deviceDao.save(computer);
			response = "OK";
			
		} catch(Exception e) {
			DeviceService.LOGGER.warning("Error!! processing Computer data to save: " + e);
			response = "ERROR";
		}
		
		return response;
	}

	@Override
	@Transactional
	public String deleteDevice(Integer id) {
		String response = "";
		
		try {
			DeviceService.LOGGER.info("Processing Computer data to delete.");
			
			this.deviceDao.deleteById(id);
			response = "OK";
			
		} catch(Exception e) {
			DeviceService.LOGGER.warning("Error!! processing Computer data to delete: " + e);
			response = "ERROR";
		}
		
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public Device getById(Integer id) {
		String response = "";
		
		try {			
			this.deviceDao.findById(id);
			response = "OK";
			
		} catch(Exception e) {
			DeviceService.LOGGER.warning("Error!! processing Computer data to delete: " + e);
			response = "ERROR";
		}
		
		return null;
	}
	
	

}
