package com.sun.zq.design.template;

/**
 * @author：sunzheng
 * @date 2023/2/14 21:48
 */
public abstract class AbstractClass {
    public final void processMethod() {
        method1();
        method2();
    }

    protected abstract void method1();

    protected abstract void method2();

}
