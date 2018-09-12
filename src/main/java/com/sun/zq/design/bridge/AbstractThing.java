package com.sun.zq.design.bridge;

public abstract class AbstractThing {
    private IPost post;

    public AbstractThing(IPost post) {
        this.post = post;
    }

    public void post(){
        post.post();
    }
}
