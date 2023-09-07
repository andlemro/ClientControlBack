package com.app.clientcontrolback.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "Maintenance_Kind")
public class MaintenanceKind {
	
	@Id
	@Column(name = "id_maintenance_kind", unique=true)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer idMaintenanceKind;
	
	@Column(name = "kind", nullable=false, length = 50)
	private String kind;
	
	@OneToMany(mappedBy="idDevice")
	private List<Device> devicesList;

}
