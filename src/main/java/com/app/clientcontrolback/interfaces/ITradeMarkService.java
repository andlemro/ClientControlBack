package com.app.clientcontrolback.interfaces;

import java.util.List;

import com.app.clientcontrolback.models.TradeMark;

public interface ITradeMarkService {

	public List<TradeMark> listTradeMark();
	
	public String createTradeMark(TradeMark tradeMark);
	
	public String editTradeMark(TradeMark tradeMark);
	
	public String deleteTradeMark(Integer id);
	
	
}
