package com.app.clientcontrolback.interfaces;

import java.util.List;

import com.app.clientcontrolback.models.MaintenanceKind;

public interface IMaintenanceKindService {
	
	public List<MaintenanceKind> listMaintenanceKind();
	
	public String saveMaintenanceKind(MaintenanceKind maintenanceKind);
	
	public String deleteMaintenanceKind(Integer id);
	
	public MaintenanceKind getMaintenanceKindById(Integer id);

}
