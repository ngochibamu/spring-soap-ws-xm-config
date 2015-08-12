package com.live.order.service;

import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ObjectUtils;

import com.live.order.domain.Order;

public class OrderServiceImpl implements OrderService {
	   
    private static final Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);

    public OrderServiceImpl() {
    }

    public String placeOrder(Order order) {
        logger.info("Order has been placed. Order Info is : " + ObjectUtils.nullSafeToString(order));
        return getRandomOrderRefNo();
    }

    public boolean cancelOrder(String orderRef) {
        logger.info("Order has been placed. Order Reference : " + orderRef);
        return true;
    }
   
    private String getRandomOrderRefNo() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        return "Ref-" + year + "-" + month + "-" + day + "-" + Math.random();
       
    }
}