package com.app.clientcontrolback.interfaces;

import java.util.List;

import com.app.clientcontrolback.models.Device;

public interface IDeviceService {
	
	public List<Device> listDevices();
	
	public String createDevice(Device device);
	
	public String editDevice(Device device);
	
	public String deleteDevice(Integer id);

}
