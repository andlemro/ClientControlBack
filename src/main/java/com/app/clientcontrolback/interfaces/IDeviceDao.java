package com.app.clientcontrolback.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.clientcontrolback.models.Device;

public interface IDeviceDao extends JpaRepository<Device, Integer>{

}
