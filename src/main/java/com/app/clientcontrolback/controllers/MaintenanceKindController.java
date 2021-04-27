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

import com.app.clientcontrolback.interfaces.IMaintenanceKindService;
import com.app.clientcontrolback.models.MaintenanceKind;

@RestController
@RequestMapping("/MaintenanceKinds")
public class MaintenanceKindController {
	
	@Autowired
	private IMaintenanceKindService iMaintenanceKindService;

	public static final Logger LOGGER = Logger.getLogger(MaintenanceKindController.class.getName());
	
	/****************************************************************************************/
	
	@GetMapping(value = "")
	public List<MaintenanceKind> listMaintenanceKind() {
		
		List<MaintenanceKind> listMaintenanceKinds; 
		
		try {
			MaintenanceKindController.LOGGER.info("Processing listMaintenanceKindController().");
			listMaintenanceKinds = this.iMaintenanceKindService.listMaintenanceKind();
			MaintenanceKindController.LOGGER.info("listMaintenanceKindController --- OK");
			return listMaintenanceKinds;
		} catch(Exception e) {
			MaintenanceKindController.LOGGER.warning("Error!! processing listMaintenanceKindController(): " + e);
			return null;
		}
		
	}
	
	/****************************************************************************************/
	
	@PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
	public String createMaintenanceKind(@RequestBody MaintenanceKind maintenanceKind) {	
		String response = "";
		response = this.iMaintenanceKindService.createMaintenanceKind(maintenanceKind);
		return response;
	}
	
	/****************************************************************************************/
	
	@PutMapping(value = "/edit", produces = MediaType.APPLICATION_JSON_VALUE)
	public String editMaintenanceKind(@RequestBody MaintenanceKind maintenanceKind) {
		String response = "";
		response = this.iMaintenanceKindService.editMaintenanceKind(maintenanceKind);
		return response;
	}
	
	/****************************************************************************************/
	
	@DeleteMapping(value = "/delete/{id}")
	public String deleteTradeMark(@PathVariable("id") Integer id) {
		String response = "";
		response = this.iMaintenanceKindService.deleteMaintenanceKind(id);
		return response;
	}
	
}
