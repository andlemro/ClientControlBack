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
@Table(name = "Trade_Mark")
public class TradeMark {
	
	@Id
	@Column(name = "id_trade_mark", unique=true)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer idTradeMark;
	
	@Column(name = "mark", nullable=false, length = 50)
	private String mark;
	
	@OneToMany(mappedBy="idDevice")
	private List<Device> devicesList;

}
