package com.app.clientcontrolback.services;

import java.util.List;

import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.clientcontrolback.dao.TradeMarkDao;
import com.app.clientcontrolback.interfaces.ITradeMarkService;
import com.app.clientcontrolback.models.TradeMark;

@Service
public class TradeMarkService implements ITradeMarkService {
	
	@Autowired
	private TradeMarkDao tradeMarkDao;
	
	public static final Logger LOGGER = Logger.getLogger(TradeMarkService.class.getName());

	@Override
	@Transactional(readOnly = true)
	public List<TradeMark> listTradeMark() {
		return (List<TradeMark>) this.tradeMarkDao.findAll();
	}

	@Override
	@Transactional
	public String saveTradeMark(TradeMark tradeMark) {
		String response = "";
		
		try {
			TradeMarkService.LOGGER.info("Processing TradeMark data to save.");

			this.tradeMarkDao.save(tradeMark);
			response = "OK";
			
		} catch(Exception e) {
			TradeMarkService.LOGGER.warning("Error!! processing TradeMark data to save: " + e);
			response = "ERROR";
		}
		
		return response;
	}

	@Override
	@Transactional
	public String deleteTradeMark(Integer id) {
		String response = "";
		
		try {
			TradeMarkService.LOGGER.info("Processing TradeMark data to delete.");
			
			this.tradeMarkDao.deleteById(id);
			response = "OK";
			
		} catch(Exception e) {
			TradeMarkService.LOGGER.warning("Error!! processing TradeMark data to delete: " + e);
			response = "ERROR";
		}
		
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public TradeMark getTradeMarkById(Integer id) {
		String response = "";
		
		try {
			this.tradeMarkDao.findById(id);
			response = "OK";
			
		} catch(Exception e) {
			TradeMarkService.LOGGER.warning("Error!! processing TradeMark data to delete: " + e);
			response = "ERROR";
		}
		
		return null;
	}

}
