package com.sun.zq.design.observer.originaobserver;

public interface ISubject {
    /**
     * 增加观察者
     */
    void addObserver(IObserver observer);

    /**
     * 移除观察者
     */
    void removeObserver(IObserver observer);

    /**
     * 通知观察者,推的方式
     */
    void notifyObserver();

    /**
     * 通知观察者,观察者主动"拉"的方式
     */
    void notifyObserverPull();


}
