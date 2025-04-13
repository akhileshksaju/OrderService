package com.aksprojects.order_service.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aksprojects.order_service.DTO.OrderRequest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/order")
public class OrderControler {

  @PostMapping
  public String placeOrder (@RequestBody OrderRequest orderRequest) {
      //TODO: process POST request
      
      return "Order Placed Success Fully";
  }
  

}
