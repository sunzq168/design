package com.sun.zq.design.strategy;

/**
 * @author：sunzheng
 * @date 2023/2/12 21:20
 */
public class GraphFactory {
    public static Graph getGraph(String type, double length, double width) {
        switch (type){
            case "circle" :
                return new Circle(length);
            case "square" :
                return new Square(length);
            case "rectangle" :
                return new Rectangle(length, width);
            default:
                return null;
        }

    }
}
