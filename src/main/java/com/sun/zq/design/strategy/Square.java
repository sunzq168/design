package com.sun.zq.design.strategy;

/**
 * @description: 正方形面积
 * @author：sunzheng
 * @date 2023/2/12 21:10
 */
public class Square implements Graph {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double calcArea() {
        return Math.sqrt(length);
    }
}
