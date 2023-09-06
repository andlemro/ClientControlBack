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
@RequestMapping("/Computers")
public class DeviceController {
	
	@Autowired
	private IDeviceService iComputerService;
	
	public static final Logger LOGGER = Logger.getLogger(DeviceController.class.getName());
	
	/****************************************************************************************/
	
	@GetMapping(value = "")
	public List<Device> listComputer() {
		
		List<Device> listComputers; 
		
		try {
			DeviceController.LOGGER.info("Processing listComputerController().");
			listComputers = this.iComputerService.listDevices();
			DeviceController.LOGGER.info("listClientController --- OK");
			return listComputers;
		} catch(Exception e) {
			DeviceController.LOGGER.warning("Error!! processing listComputerController(): " + e);
			return null;
		}
		
	}
	
	/****************************************************************************************/
	
	@PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
	public String createComputer(@RequestBody Device computer) {	
		String response = "";
		response = this.iComputerService.createDevice(computer);
		return response;
	}
	
	/****************************************************************************************/
	
	@PutMapping(value = "/edit", produces = MediaType.APPLICATION_JSON_VALUE)
	public String editComputer(@RequestBody Device computer) {
		String response = "";
		response = this.iComputerService.editDevice(computer);
		return response;
	}
	
	/****************************************************************************************/
	
	@DeleteMapping(value = "/delete/{id}")
	public String deleteComputer(@PathVariable("id") Integer id) {
		String response = "";
		response = this.iComputerService.deleteDevice(id);
		return response;
	}

}
