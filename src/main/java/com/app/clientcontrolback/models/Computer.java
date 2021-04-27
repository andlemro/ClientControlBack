package com.app.clientcontrolback.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "COMPUTER")
public class Computer {
	
	@Id
	@Column(name = "ID_COMPUTER", unique=true)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer idComputer;
	
	@Column(name = "MAINTENANCEDATE", nullable=false)
	private Date maintenanceDate;
	
	@Column(name = "DESCRIPTION", nullable=false, length = 200)
	private String description;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="ID_CLIENT", referencedColumnName="ID_CLIENT", nullable=false)
	private Client idClient;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="ID_TRADE_MARK", referencedColumnName="ID_TRADE_MARK", nullable=false)
	private TradeMark idTradeMark;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="ID_MAINTENANCE_KIND", referencedColumnName="ID_MAINTENANCE_KIND", nullable=false)
	private MaintenanceKind idMaintenanceKind;

	public Integer getIdComputer() {
		return idComputer;
	}

	public void setIdComputer(Integer idComputer) {
		this.idComputer = idComputer;
	}

	public Date getMaintenanceDate() {
		return maintenanceDate;
	}

	public void setMaintenanceDate(Date maintenanceDate) {
		this.maintenanceDate = maintenanceDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Client getIdClient() {
		return idClient;
	}

	public void setIdClient(Client idClient) {
		this.idClient = idClient;
	}

	public TradeMark getIdTradeMark() {
		return idTradeMark;
	}

	public void setIdTradeMark(TradeMark idTradeMark) {
		this.idTradeMark = idTradeMark;
	}

	public MaintenanceKind getIdMaintenanceKind() {
		return idMaintenanceKind;
	}

	public void setIdMaintenanceKind(MaintenanceKind idMaintenanceKind) {
		this.idMaintenanceKind = idMaintenanceKind;
	}

}
