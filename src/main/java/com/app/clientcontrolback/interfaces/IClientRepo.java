package com.app.clientcontrolback.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.clientcontrolback.models.Client;

public interface IClientRepo extends JpaRepository<Client, Integer> {

}
