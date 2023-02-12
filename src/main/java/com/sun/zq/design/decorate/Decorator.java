package com.sun.zq.design.decorate;

public abstract class Decorator implements ILogger{
    public ILogger logger;

    public Decorator(ILogger logger) {
        this.logger = logger;
    }

    @Override
    public void show(String message) {
        this.logger.show(message);
    }
}
