package com.company;

public abstract class PizzaFactoryCommand {
    public abstract void execute(PizzaFactory factory);

    public static class OrderMarguerita extends PizzaFactoryCommand {
        @Override
        public void execute(PizzaFactory factory) {
            factory.createPizzaWithTopping(Topping.MARGUERITA);
        }
    }
    public static class OrderQuattroStagioni extends PizzaFactoryCommand {
        @Override
        public void execute(PizzaFactory factory) {
            factory.createPizzaWithTopping(Topping.QUATTRO_STAGIONI);
        }
    }
    public static class OrderProsciuttoFunghi extends PizzaFactoryCommand {
        @Override
        public void execute(PizzaFactory factory) {
            factory.createPizzaWithTopping(Topping.PROSCIUTTO_FUNGHI);
        }
    }
    public static class OrderCapriciosa extends PizzaFactoryCommand {
        @Override
        public void execute(PizzaFactory factory) {
            factory.createPizzaWithTopping(Topping.CAPRICIOSA);
        }
    }

}

