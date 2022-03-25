package com.company;

public class GenericObservable<T> {
    private T state = null;
    public GenericObserver<T> observer = null;

    public T getState() {
        return state;
    }

    public void setState(T state) {
        this.state = state;
        notifyObserver();
    }

    public void notifyObserver() {
        observer.receiveUpdate(state);
    }

    public void attachObserver(GenericObserver<T> observer) {
        this.observer = observer;
    }

    // private static GenericObservable subject = null;
}
