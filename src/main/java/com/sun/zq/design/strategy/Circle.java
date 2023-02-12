package com.sun.zq.design.strategy;

/**
 * @author：sunzheng
 * @date 2023/2/12 21:13
 */
public class Circle implements Graph {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return 3.14 * Math.pow(radius, 2);
    }
}
