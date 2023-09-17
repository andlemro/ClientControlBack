package com.app.clientcontrolback.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.app.clientcontrolback.models.MaintenanceKind;

public interface MaintenanceKindDao extends PagingAndSortingRepository<MaintenanceKind, Integer> {

}
