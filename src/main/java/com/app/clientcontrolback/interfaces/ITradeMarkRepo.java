package com.app.clientcontrolback.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.clientcontrolback.models.TradeMark;

public interface ITradeMarkRepo extends JpaRepository<TradeMark, Integer> {

}
