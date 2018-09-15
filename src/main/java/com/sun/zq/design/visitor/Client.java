package com.sun.zq.design.visitor;

public class Client {
    public static void main(String[] args) {
        IncomeBill bill1 = new IncomeBill(1000,"工资");
        IncomeBill bill2 = new IncomeBill(2000,"收入");
        IncomeBill bill3 = new IncomeBill(3000,"收息");

        ConsumeBill bill4 = new ConsumeBill(4000,"工资");
        ConsumeBill bill5 = new ConsumeBill(5000,"支出");
        ConsumeBill bill6 = new ConsumeBill(6000,"还款");

        AccountBook book = new AccountBook();
        book.addBill(bill1);
        book.addBill(bill2);
        book.addBill(bill3);
        book.addBill(bill4);
        book.addBill(bill5);
        book.addBill(bill6);



        Boss boss = new Boss();
        CPA cpa = new CPA();

        book.show(boss);
        book.show(cpa);

        boss.getTotalConsume();
        boss.getTotalIncome();



    }
}
