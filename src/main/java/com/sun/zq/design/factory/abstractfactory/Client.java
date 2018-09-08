package com.sun.zq.design.factory.abstractfactory;

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
