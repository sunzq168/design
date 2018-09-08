package com.sun.zq.design.factory.abstractfactory;

public class LowFactory extends AbstractFactory {
    @Override
    public ICar createCar() {
        return new LowCar();
    }

    @Override
    public IBus createBus() {
        return new LowBus();
    }
}
