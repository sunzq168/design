package com.sun.zq.design.visitor;

public class CPA implements AccountBookViewer {
    @Override
    public void view(ConsumeBill bill) {
        if (bill.getItem().equals("工资")) {
            System.out.println("注会查看工资是否交个人所得税。");
        }
    }

    @Override
    public void view(IncomeBill bill) {
        System.out.println("注会查看收入交税了没。");
    }
}
