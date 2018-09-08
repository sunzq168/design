package com.sun.zq.design.factory.factorydesign.factory;

import com.sun.zq.design.factory.factorydesign.ICar;
import com.sun.zq.design.factory.factorydesign.LowCar;

public class LowCarFactory extends AbstractCarFactory {
    @Override
    public ICar createCar() {
        return new LowCar();
    }
}
