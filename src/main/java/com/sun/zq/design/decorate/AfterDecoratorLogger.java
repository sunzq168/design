package com.sun.zq.design.decorate;

public class AfterDecoratorLogger extends Decorator {

    public AfterDecoratorLogger(ILogger logger) {
        super(logger);
    }

    public void afterShowLog() {
        System.out.println("最后再装修一下日志吧");
    }

    @Override
    public void show(String message) {
        super.show(message);
        this.afterShowLog();

    }
}
