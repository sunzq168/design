package com.sun.zq.design.visitor;

public interface AccountBookViewer {
        void view(ConsumeBill bill);

        void view(IncomeBill bill);
}
