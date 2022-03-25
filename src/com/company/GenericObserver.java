package com.company;

public abstract class GenericObserver<T>{
    GenericObservable<T> subject;

    public GenericObserver(GenericObservable<T> subject) {
        this.subject = subject;
        this.subject.attachObserver(this);
    }

    public abstract void receiveUpdate(T state);

}
