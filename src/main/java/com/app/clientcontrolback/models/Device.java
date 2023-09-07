package com.app.clientcontrolback.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "Device")
public class Device {
	
	@Id
	@Column(name = "id_device", unique=true)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer idDevice;
	
	@Column(name = "maintenance_date", nullable=false)
	private Date maintenanceDate;
	
	@Column(name = "description", nullable=false, length = 200)
	private String description;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="id_client", referencedColumnName="id_client", nullable=false)
	private Client idClient;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="id_trade_mark", referencedColumnName="id_trade_mark", nullable=false)
	private TradeMark idTradeMark;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="ID_MAINTENANCE_KIND", referencedColumnName="ID_MAINTENANCE_KIND", nullable=false)
	private MaintenanceKind idMaintenanceKind;

}
