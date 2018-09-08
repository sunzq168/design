package com.sun.zq.design.factory.factorydesign;


import com.sun.zq.design.factory.factorydesign.factory.AbstractCarFactory;
import com.sun.zq.design.factory.factorydesign.factory.LowCarFactory;
import com.sun.zq.design.factory.factorydesign.factory.MiddleCarFactory;
import com.sun.zq.design.factory.factorydesign.factory.TopCarFactory;

public class CreateCarClient {
    public static void main(String[] args) {
        ICar car;
        AbstractCarFactory carFactory;

        carFactory = new LowCarFactory();
        car = carFactory.createCar();
        System.out.println(car);

        carFactory = new MiddleCarFactory();
        car = carFactory.createCar();
        System.out.println(car);

        carFactory = new TopCarFactory();
        car = carFactory.createCar();
        System.out.println(car);



    }
}
