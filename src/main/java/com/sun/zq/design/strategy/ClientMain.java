package com.sun.zq.design.strategy;

/**
 * @author：sunzheng
 * @date 2023/2/12 21:20
 */
public class ClientMain {
    public static void main(String[] args) {
        System.out.println(Math.pow(5.0, 2));
        Graph circle = GraphFactory.getGraph("circle", 5.0d, 0.0d);
        double v = circle.calcArea();
        System.out.println(v);
    }
}
