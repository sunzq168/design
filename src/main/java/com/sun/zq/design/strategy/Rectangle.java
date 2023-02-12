package com.sun.zq.design.strategy;

/**
 * @description: 长方形面积
 * @author：sunzheng
 * @date 2023/2/12 21:15
 */
public class Rectangle implements Graph {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calcArea() {
        return length * width;
    }
}
