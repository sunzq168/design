package com.sun.zq.design.proxy.dynamicproxy;

public class CalcInterfaceImpl implements IInterface {
    @Override
    public void add() {
        System.out.println("用计算器计算加法");
    }

    @Override
    public void subtract() {
        System.out.println("用计算器计算减法");
    }
}
