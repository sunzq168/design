package com.sun.zq.design.factory.abstractfactory.factory;

import com.sun.zq.design.factory.abstractfactory.bus.IBus;
import com.sun.zq.design.factory.abstractfactory.car.ICar;

public abstract class AbstractFactory {
    public abstract ICar createCar();
    public abstract IBus createBus();
}
