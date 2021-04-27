package com.app.clientcontrolback.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.clientcontrolback.models.Computer;

public interface IComputerRepo extends JpaRepository<Computer, Integer>{

}
