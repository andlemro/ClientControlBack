package com.app.clientcontrolback.interfaces;

import java.util.List;

import com.app.clientcontrolback.models.Client;

public interface IClientService {
	
	public List<Client> listClient();
	
	public String saveClient(Client client);
	
	public String deleteClient(Integer id);
	
	public Client getById(Integer id);

}
