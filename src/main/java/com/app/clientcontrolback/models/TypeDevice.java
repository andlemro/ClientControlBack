package com.app.clientcontrolback.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "Type_Device")
public class TypeDevice {
	
	@Id
	@Column(name = "id_type_device", unique=true)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer idTypeDevice;
	
	@Column(name = "name", nullable=false, length = 50)
	private String name;

}
