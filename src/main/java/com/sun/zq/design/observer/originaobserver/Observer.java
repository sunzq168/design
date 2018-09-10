package com.sun.zq.design.observer.originaobserver;

public class Observer implements IObserver {
    @Override
    public void update(String data) {
        System.out.println("推的方式通知观察者数据, data = " + data);
    }

    @Override
    public void update(ISubject object) {
        if (object != null) {
            Subject subject = (Subject)object;
            String data = subject.getData();
            System.out.println("拉的方式获取数据, data = " + data);
        }
    }
}
