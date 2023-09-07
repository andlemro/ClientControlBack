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
@Table(name = "User")
public class User {
	
	@Id
	@Column(name = "id_user", unique=true)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer idUser;
	
	@Column(name = "name", nullable=false, length = 50)
	private String name;
	
	@Column(name = "password", nullable=false, length = 50)
	private String password;

}
