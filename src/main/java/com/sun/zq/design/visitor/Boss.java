package com.sun.zq.design.visitor;

public class Boss implements AccountBookViewer {
    private long totalIncome;

    private long totalConsume;

    @Override
    public void view(ConsumeBill bill) {
        totalConsume += bill.getAmt();
    }

    @Override
    public void view(IncomeBill bill) {
        totalIncome += bill.getAmt();
    }

    public long getTotalIncome(){
        System.out.println("老板查看一共收入多少，数目是：" + totalIncome);
        return totalIncome;
    }

    public double getTotalConsume() {
        System.out.println("老板查看一共花费多少，数目是：" + totalConsume);
        return totalConsume;
    }
}
