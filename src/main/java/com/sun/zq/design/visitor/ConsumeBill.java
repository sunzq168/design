package com.sun.zq.design.visitor;

public class ConsumeBill implements Bill{
    private long amt;

    private String item;

    public ConsumeBill(long amt, String item) {
        super();
        this.amt = amt;
        this.item = item;
    }

    @Override
    public void accept(AccountBookViewer viewer) {
        viewer.view(this);
    }

    public long getAmt() {
        return amt;
    }

    public void setAmt(long amt) {
        this.amt = amt;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
