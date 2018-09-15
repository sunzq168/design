package com.sun.zq.design.decorate;

public class ClientTest {
    public static void main(String[] args) {
        ILogger logger = new ConsoleLogger();

        ConsoleUpCaseLogger cl = new ConsoleUpCaseLogger(logger);
        cl.show("hello");
    }
}
