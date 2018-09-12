package com.sun.zq.design.bridge;

public class SimplePost implements IPost {
    @Override
    public void post() {
        System.out.println("平邮寄件...");
    }
}
