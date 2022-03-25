package com.company;

public class ToppingDecorator extends Pizza{
    protected Pizza decoratedPizza;

    public ToppingDecorator(Pizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
    }
}
