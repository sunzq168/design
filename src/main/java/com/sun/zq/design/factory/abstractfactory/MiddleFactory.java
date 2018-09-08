package com.sun.zq.design.factory.abstractfactory;

public class MiddleFactory extends AbstractFactory {
    @Override
    public ICar createCar() {
        return new MiddleCar();
    }

    @Override
    public IBus createBus() {
        return new MiddleBus();
    }
}
