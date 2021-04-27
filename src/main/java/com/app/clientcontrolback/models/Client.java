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
@Table(name = "CLIENT")
public class Client {
	
	@Id
	@Column(name = "ID_CLIENT", unique=true)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer idClient;
	
	@Column(name = "NAME", nullable=false, length = 40)
	private String name;
	
	@Column(name = "PHONE_NUMBER", nullable=false)
	private String phoneNumber;
	
	@Column(name = "ADRESS", nullable=false, length = 50)
	private String adress;
	
	@Column(name = "NEIGHBORHOOD", nullable=false, length = 50)
	private String neighborhood;
	
	@OneToMany(mappedBy="idComputer")
	private List<Computer> computersList;
	
	
	public Client() {
		super();
	}

	public Client(Integer idClient, String name, String phoneNumber, String adress, String neighborhood,
			List<Computer> computersList) {
		super();
		this.idClient = idClient;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.adress = adress;
		this.neighborhood = neighborhood;
		this.computersList = computersList;
	}

	public Integer getIdClient() {
		return idClient;
	}

	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public List<Computer> getComputersList() {
		return computersList;
	}

	public void setComputersList(List<Computer> computersList) {
		this.computersList = computersList;
	}
	
	
}
