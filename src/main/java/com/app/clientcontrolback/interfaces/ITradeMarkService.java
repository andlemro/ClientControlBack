package com.app.clientcontrolback.interfaces;

import java.util.List;

import com.app.clientcontrolback.models.TradeMark;

public interface ITradeMarkService {

	public List<TradeMark> listTradeMark();
	
	public String saveTradeMark(TradeMark tradeMark);
	
	public String deleteTradeMark(Integer id);
	
	public TradeMark getTradeMarkById(Integer id);	
	
}
