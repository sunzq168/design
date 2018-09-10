package com.sun.zq.design.observer.jdkobserver;

import java.util.Observable;

public class Subject extends Observable {
    String data ;

    public void setData(String data) {
        this.data = data;
        setChanged();
        notifyObservers();
    }

    public String getData() {
        return data;
    }
}
