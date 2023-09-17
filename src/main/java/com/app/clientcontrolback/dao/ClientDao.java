package com.app.clientcontrolback.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.app.clientcontrolback.models.Client;

public interface ClientDao extends PagingAndSortingRepository<Client, Integer> {

}
