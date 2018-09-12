package com.sun.zq.design.proxy.staticproxy;

public class ClientTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        AgentProxy proxy = new AgentProxy(customer);
        proxy.findHouse();
    }
}
