package com.app.clientcontrolback.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.clientcontrolback.models.TradeMark;

public interface ITradeMarkDao extends JpaRepository<TradeMark, Integer> {

}
