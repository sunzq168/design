package com.sun.zq.design.proxy.staticproxy;

public class Customer implements RentHouse {
    @Override
    public void findHouse() {
        System.out.println("客户自己找房子");
    }
}
