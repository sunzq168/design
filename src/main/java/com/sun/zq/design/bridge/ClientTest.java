package com.sun.zq.design.bridge;

public class ClientTest {
    public static void main(String[] args) {
        IPost post = new SimplePost();
        post = new MarkPost();
        LetterThing letter = new LetterThing(post);
        letter.post();

    }
}
