package com.sun.zq.design.observer.jdkobserver;

import java.util.Observable;

public class MyObserver implements java.util.Observer {
    @Override
    public void update(Observable o, Object arg) {
        Subject subject = (Subject)o;
        String data = subject.getData();
        System.out.println("jdk 观察者模式拉的方式获取数据:data = " + data);
    }
}
