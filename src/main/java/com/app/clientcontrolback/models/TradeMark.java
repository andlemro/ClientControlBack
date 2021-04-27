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
@Table(name = "TRADE_MARK")
public class TradeMark {
	
	@Id
	@Column(name = "ID_TRADE_MARK", unique=true)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer idTradeMark;
	
	@Column(name = "MARK", nullable=false, length = 50)
	private String mark;
	
	@OneToMany(mappedBy="idComputer")
	private List<Computer> computersList;

	public Integer getIdTradeMark() {
		return idTradeMark;
	}

	public void setIdTradeMark(Integer idTradeMark) {
		this.idTradeMark = idTradeMark;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public List<Computer> getComputersList() {
		return computersList;
	}

	public void setComputersList(List<Computer> computersList) {
		this.computersList = computersList;
	}	
	

}
