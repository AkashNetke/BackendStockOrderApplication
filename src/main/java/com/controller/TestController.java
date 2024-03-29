package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.CreateOrder;
import com.model.TradeDetails;
import com.service.CreateOrderInterface;
import com.service.TradeDetailsInterface;

@CrossOrigin(origins = "http://localhost:4200")

@RestController
public class TestController {
	
	@Autowired
	TradeDetailsInterface tradeDetailInterface;
	
	@PostMapping("/saveTradeDetails")
	public TradeDetails saveDetails(@RequestBody TradeDetails tradeDetails) {
	
	return tradeDetailInterface.saveDetails(tradeDetails);
	}

	@GetMapping("/getAllDetails")
	public List<TradeDetails> getAllTradeDetails() {
	
	return tradeDetailInterface.getAllTradeDetails();
	}
	
	@DeleteMapping("del/{id}")
	public void deleteTrade(@PathVariable int id) {
	
		tradeDetailInterface.deleteTrade(id);
	
	}
	
	@PutMapping("update")
	public TradeDetails updateDetails(@RequestBody TradeDetails tradeDetails) {
	
	return tradeDetailInterface.updateDetails(tradeDetails);
	}
	
	@GetMapping("/get/{id}")
	public TradeDetails getTradeById(@PathVariable int id) {
	
		return tradeDetailInterface.getTradeById(id);
	
	}
	
	@Autowired
	CreateOrderInterface CreateOrders;
	
	@PostMapping("/saveOrder")
	public CreateOrder saveOrder(@RequestBody CreateOrder createOrder) {
		createOrder.setStatus("created");
	return CreateOrders.saveOrder(createOrder);
	}
	
	@GetMapping("/getOrders")
	public List<CreateOrder> getAllOrder() {
	return CreateOrders.getAllOrder();
	}
}
