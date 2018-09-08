package com.sun.zq.design.factory.simplestaticfactory;

public class CarSimpleFactory {
    private static final String TOPCAR = "topCar";
    private static final String MIDDLECAR = "MiddleCar";
    private static final String LOWCAR = "LowCar";

    public static ICar createCar(String mark) {
        ICar car = null;
        if (TOPCAR.equals(mark)) {
            car = new TopCar();
        } else if (MIDDLECAR.equals(mark)) {
            car = new MiddleCar();
        } else {
            car = new LowCar();
        }

        return car;
    }

}
