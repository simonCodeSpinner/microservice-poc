package com.lunch.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller{

    @Autowired
    OrderService greetingServices;

    @RequestMapping("/order")
    public Order order(@RequestParam(value="name", defaultValue="World") String name) {
        return greetingServices.greeting(name);
    }

    @RequestMapping("/readChat")
    public List<Order> readChat() {
        return greetingServices.readChat();
    }
}