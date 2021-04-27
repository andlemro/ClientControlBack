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

import com.app.clientcontrolback.interfaces.IClientService;
import com.app.clientcontrolback.models.Client;

@RestController
@RequestMapping("/Clients")
public class ClientController {
	
	@Autowired
	private IClientService iClientService;
	
	public static final Logger LOGGER = Logger.getLogger(ClientController.class.getName());
	
	/****************************************************************************************/
	
	@GetMapping(value = "")
	public List<Client> listClient() {
		
		List<Client> listClients; 
		
		try {
			ClientController.LOGGER.info("Processing listClientController().");
			listClients = this.iClientService.listClient();
			ClientController.LOGGER.info("listClientController --- OK");
			return listClients;
		} catch(Exception e) {
			ClientController.LOGGER.warning("Error!! processing listClientController(): " + e);
			return null;
		}
		
	}
	
	/****************************************************************************************/
	
	@PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
	public String createClient(@RequestBody Client client) {	
		String response = "";
		response = this.iClientService.createClient(client);
		return response;	
	}
	
	/****************************************************************************************/
	
	@PutMapping(value = "/edit", produces = MediaType.APPLICATION_JSON_VALUE)
	public String editClient(@RequestBody Client client) {
		String response = "";
		response = this.iClientService.editClient(client);
		return response;
	}
	
	/****************************************************************************************/
	
	@DeleteMapping(value = "/delete/{id}")
	public String deleteClient(@PathVariable("id") Integer id) {
		String response = "";
		response = this.iClientService.deleteClient(id);
		return response;
	}
	

}
