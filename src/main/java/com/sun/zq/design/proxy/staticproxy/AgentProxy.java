package com.sun.zq.design.proxy.staticproxy;

public class AgentProxy implements RentHouse{
    private RentHouse rentHouse;

    public AgentProxy(RentHouse rentHouse){
        this.rentHouse = rentHouse;
    }

    @Override
    public void findHouse() {
        System.out.println("中介找房源,带客户看房子");
        rentHouse.findHouse();
        System.out.println("客户决定是否租该房子");
    }
}
