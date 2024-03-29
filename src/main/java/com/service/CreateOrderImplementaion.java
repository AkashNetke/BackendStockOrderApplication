package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.CreateOrder;
import com.repository.OrderStatusRepository;

@Service
public class CreateOrderImplementaion implements CreateOrderInterface{
	
	@Autowired
	OrderStatusRepository orderStatus;

	@Override
	public CreateOrder saveOrder(CreateOrder createOrder) {
		// TODO Auto-generated method stub
		return orderStatus.save(createOrder);
	}

	@Override
	public List<CreateOrder> getAllOrder() {
		// TODO Auto-generated method stub
		return orderStatus.findAll();
	}
	
	
	

}
