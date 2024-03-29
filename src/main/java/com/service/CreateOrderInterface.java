package com.service;

import java.util.List;

import com.model.CreateOrder;

public interface CreateOrderInterface {
	
	public CreateOrder saveOrder(CreateOrder createOrder);
	
	public List<CreateOrder> getAllOrder();

}
