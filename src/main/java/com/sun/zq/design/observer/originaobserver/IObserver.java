package com.sun.zq.design.observer.originaobserver;

public interface IObserver {
    /**
     * 推的方式通知观察者
     */
    void update(String data);

    /**
     * 观察者主动拉的方式
     */
    void update(ISubject subject);

}
