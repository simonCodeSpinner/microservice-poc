package com.lunch.producer;

public class Order {

    private final String dish;
    private final String hungry;

    public Order(String dish, String hungry) {
        this.dish = dish;
        this.hungry = hungry;
    }

    public String getDish() {
        return dish;
    }

    public String getHungry() {
        return hungry;
    }
}
