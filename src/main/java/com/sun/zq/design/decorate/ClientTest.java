package com.sun.zq.design.decorate;

public class ClientTest {
    public static void main(String[] args) {
        ILogger logger = new ConsoleLogger();

        AfterDecoratorLogger ad = new AfterDecoratorLogger(new BeforeDecoratorLogger(logger));
        ad.show("hello");
    }
}
