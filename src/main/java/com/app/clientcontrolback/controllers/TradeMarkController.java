package com.app.clientcontrolback.controllers;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.clientcontrolback.interfaces.ITradeMarkService;
import com.app.clientcontrolback.models.TradeMark;
import com.app.clientcontrolback.services.TradeMarkService;


@RestController
@RequestMapping("/TradeMarks")
public class TradeMarkController {
	
	@Autowired
	private ITradeMarkService iTradeMarkService;
	
	public static final Logger LOGGER = Logger.getLogger(TradeMarkController.class.getName());
	
	/****************************************************************************************/
	
	@GetMapping(value = "")
	public List<TradeMark> listTradeMark() {
		
		List<TradeMark> listTradeMarks; 
		
		try {
			TradeMarkService.LOGGER.info("Processing listTradeMarkController().");
			listTradeMarks = this.iTradeMarkService.listTradeMark();
			TradeMarkService.LOGGER.info("listTradeMarkController --- OK");
			return listTradeMarks;
		} catch(Exception e) {
			TradeMarkController.LOGGER.warning("Error!! processing listTradeMarkController(): " + e);
			return null;
		}
		
	}
	
	/****************************************************************************************/
	
	@PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
	public String createTradeMark(@RequestBody TradeMark tradeMark) {	
		String response = "";
		response = this.iTradeMarkService.createTradeMark(tradeMark);
		return response;
		
	}
	
	/****************************************************************************************/
	
	@PutMapping(value = "/edit", produces = MediaType.APPLICATION_JSON_VALUE)
	public String editTradeMark(@RequestBody TradeMark tradeMark) {
		String response = "";
		response = this.iTradeMarkService.editTradeMark(tradeMark);
		return response;
	}
	
	/****************************************************************************************/
	
	@DeleteMapping(value = "/delete/{id}")
	public String deleteTradeMark(@PathVariable("id") Integer id) {
		String response = "";
		response = this.iTradeMarkService.deleteTradeMark(id);
		return response;
	}
	

}
