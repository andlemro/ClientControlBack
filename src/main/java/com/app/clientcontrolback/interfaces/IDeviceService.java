package com.app.clientcontrolback.interfaces;

import java.util.List;

import com.app.clientcontrolback.models.Device;

public interface IDeviceService {
	
	public List<Device> listDevices();
	
	public String saveDevice(Device device);
	
	public String deleteDevice(Integer id);
	
	public Device getById(Integer id);

}
