package com.app.clientcontrolback.controllers;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.clientcontrolback.interfaces.IDeviceService;
import com.app.clientcontrolback.models.Device;

@RestController
@RequestMapping("/Devices")
public class DeviceController {
	
	@Autowired
	private IDeviceService iDeviceService;
	
	public static final Logger LOGGER = Logger.getLogger(DeviceController.class.getName());
	
	/****************************************************************************************/
	
	@GetMapping(value = "")
	public List<Device> listDevices() {
		
		List<Device> listDevices; 
		
		try {
			DeviceController.LOGGER.info("Processing listComputerController().");
			listDevices = this.iDeviceService.listDevices();
			DeviceController.LOGGER.info("listClientController --- OK");
			return listDevices;
		} catch(Exception e) {
			DeviceController.LOGGER.warning("Error!! processing listComputerController(): " + e);
			return null;
		}
		
	}
	
	/****************************************************************************************/
	
	@PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
	public String createDevice(@RequestBody Device device) {	
		String response = "";
		response = this.iDeviceService.saveDevice(device);
		return response;
	}
	
	/****************************************************************************************/
	
	@PutMapping(value = "/edit", produces = MediaType.APPLICATION_JSON_VALUE)
	public String editDevice(@RequestBody Device device) {
		String response = "";
		response = this.iDeviceService.saveDevice(device);
		return response;
	}
	
	/****************************************************************************************/
	
	@DeleteMapping(value = "/{id}")
	public String deleteDevice(@PathVariable("id") Integer id) {
		String response = "";
		response = this.iDeviceService.deleteDevice(id);
		return response;
	}
	
	/****************************************************************************************/
	
	@DeleteMapping(value = "/delete/{id}")
	public Device getDeviceById(@PathVariable("id") Integer id) {
		Device response = this.iDeviceService.getById(id);
		return response;
	}

}
