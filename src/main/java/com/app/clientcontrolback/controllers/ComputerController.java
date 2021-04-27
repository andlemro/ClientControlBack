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

import com.app.clientcontrolback.interfaces.IComputerService;
import com.app.clientcontrolback.models.Computer;

@RestController
@RequestMapping("/Computers")
public class ComputerController {
	
	@Autowired
	private IComputerService iComputerService;
	
	public static final Logger LOGGER = Logger.getLogger(ComputerController.class.getName());
	
	/****************************************************************************************/
	
	@GetMapping(value = "")
	public List<Computer> listComputer() {
		
		List<Computer> listComputers; 
		
		try {
			ComputerController.LOGGER.info("Processing listComputerController().");
			listComputers = this.iComputerService.listComputers();
			ComputerController.LOGGER.info("listClientController --- OK");
			return listComputers;
		} catch(Exception e) {
			ComputerController.LOGGER.warning("Error!! processing listComputerController(): " + e);
			return null;
		}
		
	}
	
	/****************************************************************************************/
	
	@PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
	public String createComputer(@RequestBody Computer computer) {	
		String response = "";
		response = this.iComputerService.createComputer(computer);
		return response;
	}
	
	/****************************************************************************************/
	
	@PutMapping(value = "/edit", produces = MediaType.APPLICATION_JSON_VALUE)
	public String editComputer(@RequestBody Computer computer) {
		String response = "";
		response = this.iComputerService.editComputer(computer);
		return response;
	}
	
	/****************************************************************************************/
	
	@DeleteMapping(value = "/delete/{id}")
	public String deleteComputer(@PathVariable("id") Integer id) {
		String response = "";
		response = this.iComputerService.deleteComputer(id);
		return response;
	}

}
