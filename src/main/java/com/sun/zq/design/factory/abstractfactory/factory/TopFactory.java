package com.sun.zq.design.factory.abstractfactory.factory;

import com.sun.zq.design.factory.abstractfactory.bus.IBus;
import com.sun.zq.design.factory.abstractfactory.car.ICar;
import com.sun.zq.design.factory.abstractfactory.bus.TopBus;
import com.sun.zq.design.factory.abstractfactory.car.TopCar;

public class TopFactory extends AbstractFactory {
    @Override
    public ICar createCar() {
        return new TopCar();
    }

    @Override
    public IBus createBus() {
        return new TopBus();
    }
}
