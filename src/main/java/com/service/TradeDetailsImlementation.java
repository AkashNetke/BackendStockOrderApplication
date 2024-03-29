package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.TradeDetails;import com.model.TradeType;
import com.repository.TradeDetailsRepository;

@Service
public class TradeDetailsImlementation implements TradeDetailsInterface {

	@Autowired
	TradeDetailsRepository tradeRepo;
	
	
	@Override
	public TradeDetails saveDetails(TradeDetails tradeDetails) {
		return tradeRepo.save(tradeDetails);
	}

	@Override
	public List<TradeDetails> getAllTradeDetails() {
		// TODO Auto-generated method stub
		return tradeRepo.findAll();
	}

	@Override
	public void deleteTrade(int id) {
		tradeRepo.deleteById( id);		
	}

	@Override
	public TradeDetails updateDetails(TradeDetails tradeDetails) {

		TradeDetails existingTrade = tradeRepo.findById(tradeDetails.getId()).orElse(null);
		existingTrade.setStockname(tradeDetails.getStockname());
		existingTrade.setListingprice(tradeDetails.getListingprice());
		existingTrade.setPriceperunit(tradeDetails.getPriceperunit());
		existingTrade.setQuantity(tradeDetails.getQuantity());
		existingTrade.setType(tradeDetails.getType());
		existingTrade.setDatetime(tradeDetails.getDatetime());
		
		return tradeRepo.save(existingTrade) ;
	}

	@Override
	public TradeDetails getTradeById(int id) {
		// TODO Auto-generated method stub
		return tradeRepo.findById(id).orElse(null);
	}

}
