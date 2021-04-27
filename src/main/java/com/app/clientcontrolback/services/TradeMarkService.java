package com.app.clientcontrolback.services;

import java.util.List;

import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.clientcontrolback.interfaces.ITradeMarkRepo;
import com.app.clientcontrolback.interfaces.ITradeMarkService;
import com.app.clientcontrolback.models.TradeMark;

@Service
public class TradeMarkService implements ITradeMarkService {
	
	@Autowired
	private ITradeMarkRepo repo;
	
	public static final Logger LOGGER = Logger.getLogger(TradeMarkService.class.getName());

	@Override
	public List<TradeMark> listTradeMark() {
		return this.repo.findAll();
	}

	@Override
	public String createTradeMark(TradeMark tradeMark) {
		String response = "";
		
		try {
			TradeMarkService.LOGGER.info("Processing TradeMark data to save.");
			
			//TradeMark tradeMark = new TradeMark();
			//tradeMark.setMark(tradeMark);
			this.repo.save(tradeMark);
			response = "OK";
			
		} catch(Exception e) {
			TradeMarkService.LOGGER.warning("Error!! processing TradeMark data to save: " + e);
			response = "ERROR";
		}
		
		return response;
	}

	@Override
	public String editTradeMark(TradeMark tradeMark) {
		String response = "";
		
		try {
			TradeMarkService.LOGGER.info("Processing TradeMark data to edit.");
			
			this.repo.save(tradeMark);
			response = "OK";
			
		} catch(Exception e) {
			TradeMarkService.LOGGER.warning("Error!! processing TradeMark data to edit: " + e);
			response = "ERROR";
		}
		
		return response;
	}

	@Override
	public String deleteTradeMark(Integer id) {
		String response = "";
		
		try {
			TradeMarkService.LOGGER.info("Processing TradeMark data to delete.");
			
			this.repo.deleteById(id);
			response = "OK";
			
		} catch(Exception e) {
			TradeMarkService.LOGGER.warning("Error!! processing TradeMark data to delete: " + e);
			response = "ERROR";
		}
		
		return null;
	}

}
