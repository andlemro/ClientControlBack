package com.app.clientcontrolback.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.app.clientcontrolback.models.Device;

public interface DeviceDao extends PagingAndSortingRepository<Device, Integer> {

}
