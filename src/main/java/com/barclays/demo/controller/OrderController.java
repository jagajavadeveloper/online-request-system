package com.barclays.demo.controller;

import com.barclays.demo.model.OrderRequest;
import com.barclays.demo.model.OrderResponse;
import com.barclays.demo.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/v1/urban-club")
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @PostMapping("/order")
    public OrderResponse order(@RequestBody OrderRequest orderRequest){

        return null;
    }

}
