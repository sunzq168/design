package com.sun.zq.design.observer.jdkobserver;

import java.util.Observer;

public class ClientTest {
    public static void main(String[] args) {
        Observer observer = new MyObserver();
        Subject subject = new Subject();
        subject.addObserver(observer);
        subject.setData("hello");
    }
}
