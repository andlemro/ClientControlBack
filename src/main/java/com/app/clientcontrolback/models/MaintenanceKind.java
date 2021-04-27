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
@Table(name = "MAINTENANCE_KIND")
public class MaintenanceKind {
	
	@Id
	@Column(name = "ID_MAINTENANCE_KIND", unique=true)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer idMaintenanceKind;
	
	@Column(name = "KIND", nullable=false, length = 50)
	private String kind;
	
	@OneToMany(mappedBy="idComputer")
	private List<Computer> computersList;

	public Integer getIdMaintenanceKind() {
		return idMaintenanceKind;
	}

	public void setIdMaintenanceKind(Integer idMaintenanceKind) {
		this.idMaintenanceKind = idMaintenanceKind;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public List<Computer> getComputersList() {
		return computersList;
	}

	public void setComputersList(List<Computer> computersList) {
		this.computersList = computersList;
	}	

}
