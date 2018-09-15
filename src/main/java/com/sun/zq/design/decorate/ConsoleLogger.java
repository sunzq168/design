package com.sun.zq.design.decorate;

public class ConsoleLogger implements ILogger {
    @Override
    public void show(String message) {
        System.out.println("控制台打印日志:" + message);
    }
}
