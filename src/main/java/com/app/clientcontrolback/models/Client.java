package com.app.clientcontrolback.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Client")
public class Client {
	
	@Id
	@Column(name = "id_client", unique=true)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer idClient;
	
	@Column(name = "name", nullable=false, length = 40)
	private String name;
	
	@Column(name = "phone_number", nullable=false)
	private String phoneNumber;
	
	@Column(name = "address", nullable=false, length = 50)
	private String adress;
	
	@Column(name = "neighborhood", nullable=false, length = 50)
	private String neighborhood;
	
	@OneToMany(mappedBy="idDevice")
	private List<Device> devicesList;
	
}
