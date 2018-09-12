package com.sun.zq.design.bridge;

public class MarkPost implements IPost {
    @Override
    public void post() {
        System.out.println("挂号信件邮寄...");
    }
}
