package com.company;

public class PizzaFactory {
    // Singleton
    private static PizzaFactory uniqueInstance = null;

    private PizzaFactory() {}

    public static PizzaFactory getUniqueInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new PizzaFactory();
        }
        return uniqueInstance;
    }

    // Factory
    public Pizza createPizzaWithTopping(Topping topping) {
        bakedPizzaObservable.setState(topping);
        switch (topping) {
            case CAPRICIOSA:
                return new Capriciosa(new Pizza());
            case MARGUERITA:
                return new Marguerita(new Pizza());
            case QUATTRO_STAGIONI:
                return new QuattroStagioni(new Pizza());
            case PROSCIUTTO_FUNGHI:
                return new ProsciuttoFunghi(new Pizza());
        }

        return null;
    }

    // Observable
    public GenericObservable<Topping> bakedPizzaObservable = new GenericObservable<>();
}
