package com.app.clientcontrolback.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.clientcontrolback.models.Device;

public interface IDeviceRepo extends JpaRepository<Device, Integer>{

}
