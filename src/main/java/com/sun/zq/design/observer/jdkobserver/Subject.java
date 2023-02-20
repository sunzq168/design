package com.sun.zq.design.observer.jdkobserver;

import java.util.Observable;

public class Subject extends Observable {
    String data ;

    public void setData(String data) {
        this.data = data;
        super.setChanged();
        super.notifyObservers("helloworld");
    }

    public String getData() {
        return data;
    }
}
