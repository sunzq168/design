package com.sun.zq.design.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

public class ClientTest {
    public static void main(String[] args) {
        CalcInterfaceImpl impl = new CalcInterfaceImpl();
        IInterface inter = (IInterface)Proxy.newProxyInstance(impl.getClass().getClassLoader(), impl.getClass().getInterfaces(),new ProxyCalc(impl));
        inter.add();

    }

}
