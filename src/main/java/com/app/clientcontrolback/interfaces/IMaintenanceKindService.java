package com.app.clientcontrolback.interfaces;

import java.util.List;

import com.app.clientcontrolback.models.MaintenanceKind;

public interface IMaintenanceKindService {
	
	public List<MaintenanceKind> listMaintenanceKind();
	
	public String createMaintenanceKind(MaintenanceKind maintenanceKind);
	
	public String editMaintenanceKind(MaintenanceKind maintenanceKind);
	
	public String deleteMaintenanceKind(Integer id);

}
