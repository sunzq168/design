package com.sun.zq.design.factory.simplestaticfactory;

public class CreateCarClient {
    public static void main(String[] args) {
        ICar car = CarSimpleFactory.createCar("topCar");
        ClassLoader classLoader = car.getClass().getClassLoader();
        System.out.println(classLoader);

        ClassLoader parentClassLoader = classLoader.getParent();
        System.out.println(parentClassLoader);

        System.out.println(parentClassLoader.getParent());


    }
}
