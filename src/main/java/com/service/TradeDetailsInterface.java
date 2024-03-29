package com.service;

import java.util.List;

import com.model.TradeDetails;

public interface TradeDetailsInterface {
	
	public TradeDetails saveDetails(TradeDetails tradeDetails);
	
	public List<TradeDetails> getAllTradeDetails();
	
	public TradeDetails getTradeById(int id);
	
	public void deleteTrade(int id);
	
	public TradeDetails updateDetails(TradeDetails tradeDetails);
	
	
	

}
