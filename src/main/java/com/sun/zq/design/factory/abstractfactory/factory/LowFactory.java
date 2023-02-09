package com.sun.zq.design.factory.abstractfactory.factory;

import com.sun.zq.design.factory.abstractfactory.bus.IBus;
import com.sun.zq.design.factory.abstractfactory.car.ICar;
import com.sun.zq.design.factory.abstractfactory.bus.LowBus;
import com.sun.zq.design.factory.abstractfactory.car.LowCar;

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
