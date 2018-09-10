package com.sun.zq.design.observer.originaobserver;

public class ClientTest {
    public static void main(String[] args) {
        IObserver observer = new Observer();
        Subject subject = new Subject();
        subject.addObserver(observer);
        subject.setData("hello");
        subject.notifyObserver();
        subject.notifyObserverPull();
    }
}
