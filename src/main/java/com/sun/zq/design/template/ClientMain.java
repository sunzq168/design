package com.sun.zq.design.template;

/**
 * @author：sunzheng
 * @date 2023/2/14 21:51
 */
public class ClientMain {
    public static void main(String[] args) {
        AbstractClass clz = new Class1();
        clz.processMethod();

        clz = new Class2();
        clz.processMethod();
    }
}
