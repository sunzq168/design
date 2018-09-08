package com.sun.zq.design.factory.factorydesign.factory;

import com.sun.zq.design.factory.factorydesign.ICar;
import com.sun.zq.design.factory.factorydesign.MiddleCar;

public class MiddleCarFactory extends AbstractCarFactory {
    @Override
    public ICar createCar() {
        return new MiddleCar();
    }
}
