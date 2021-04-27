package com.app.clientcontrolback.interfaces;

import java.util.List;

import com.app.clientcontrolback.models.Computer;

public interface IComputerService {
	
	public List<Computer> listComputers();
	
	public String createComputer(Computer client);
	
	public String editComputer(Computer client);
	
	public String deleteComputer(Integer id);

}
