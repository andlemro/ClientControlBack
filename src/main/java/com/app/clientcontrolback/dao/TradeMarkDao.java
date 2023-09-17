package com.app.clientcontrolback.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.app.clientcontrolback.models.TradeMark;

public interface TradeMarkDao extends PagingAndSortingRepository<TradeMark, Integer> {

}
