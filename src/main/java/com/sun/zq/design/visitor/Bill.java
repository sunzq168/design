package com.sun.zq.design.visitor;

public interface Bill {
    void accept(AccountBookViewer viewer);
}
