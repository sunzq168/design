package com.sun.zq.design.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyCalc implements InvocationHandler {
    private IInterface obj;
    public ProxyCalc(IInterface obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始计算...");
        method.invoke(obj, args);
        System.out.println("结束计算...");
        return null;
    }
}
