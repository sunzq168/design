package com.sun.zq.design.factory.abstractfactory;

import com.sun.zq.design.factory.abstractfactory.bus.IBus;
import com.sun.zq.design.factory.abstractfactory.car.ICar;
import com.sun.zq.design.factory.abstractfactory.factory.AbstractFactory;
import com.sun.zq.design.factory.abstractfactory.factory.TopFactory;

public class Client {
    public static void main(String[] args) {
        ICar car;
        IBus bus;
        AbstractFactory factory;

        factory = new TopFactory();
        car = factory.createCar();
        bus = factory.createBus();

        System.out.println(car);
        System.out.println(bus);
    }
}
