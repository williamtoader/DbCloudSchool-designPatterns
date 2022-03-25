package com.company;

public class Main {

    public static void main(String[] args) {
        PizzaFactory factory = PizzaFactory.getUniqueInstance();
        Client client = new Client(factory.bakedPizzaObservable);
        new PizzaFactoryCommand.OrderMarguerita().execute(factory);
        new PizzaFactoryCommand.OrderQuattroStagioni().execute(factory);
        new PizzaFactoryCommand.OrderCapriciosa().execute(factory);
        new PizzaFactoryCommand.OrderProsciuttoFunghi().execute(factory);
    }
}
