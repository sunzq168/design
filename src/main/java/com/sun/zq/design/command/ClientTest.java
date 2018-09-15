package com.sun.zq.design.command;

public class ClientTest {
    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher(student);

        Invoke invoke = new Invoke(teacher);
        invoke.execute();
    }

}
