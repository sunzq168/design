package com.sun.zq.design.factory.factorydesign.factory;

import com.sun.zq.design.factory.factorydesign.ICar;
import com.sun.zq.design.factory.factorydesign.TopCar;

public class TopCarFactory extends AbstractCarFactory {
    @Override
    public ICar createCar() {
        return new TopCar();
    }
}
