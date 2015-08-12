package com.live.order.service;

import com.live.order.domain.Order;

public interface OrderService {
	
	public String placeOrder(Order order);
	public boolean cancelOrder(String orderRef);
}
