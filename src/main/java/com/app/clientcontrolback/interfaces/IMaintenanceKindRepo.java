package com.app.clientcontrolback.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.clientcontrolback.models.MaintenanceKind;

public interface IMaintenanceKindRepo extends JpaRepository<MaintenanceKind, Integer> {

}
