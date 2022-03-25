package com.company;

public class Client extends GenericObserver<Topping>{
    public Client(GenericObservable<Topping> subject) {
        super(subject);
    }

    @Override
    public void receiveUpdate(Topping state) {
        System.out.println(state.toString());
    }
}
