package com.sun.zq.design.factory.abstractfactory.factory;

import com.sun.zq.design.factory.abstractfactory.bus.IBus;
import com.sun.zq.design.factory.abstractfactory.car.ICar;
import com.sun.zq.design.factory.abstractfactory.bus.MiddleBus;
import com.sun.zq.design.factory.abstractfactory.car.MiddleCar;

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
