package com.sun.zq.design.observer.originaobserver;

import java.util.Vector;

public class Subject implements ISubject {
    public Vector<IObserver> vc = new Vector<>();

    public String data;

    @Override
    public void addObserver(IObserver observer) {
        vc.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        if (vc.contains(observer)) {
            vc.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        if (vc != null && vc.size() > 0) {
            for (IObserver observer : vc) {
                observer.update(data);
            }
        }

    }

    @Override
    public void notifyObserverPull() {
        if (vc != null && vc.size() > 0) {
            for (IObserver observer : vc) {
                observer.update(this);
            }
        }
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
