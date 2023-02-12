package com.sun.zq.design.decorate;

public class BeforeDecoratorLogger extends Decorator {

    public BeforeDecoratorLogger(ILogger logger) {
        super(logger);
    }

    public void beforeShowLog() {
        System.out.println("先装修一下日志吧，");
    }

    @Override
    public void show(String message) {
        this.beforeShowLog();
        super.show(message);

    }
}
