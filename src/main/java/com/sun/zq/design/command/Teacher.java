package com.sun.zq.design.command;

public class Teacher implements ICommand {
    private Student student;

    public Teacher(Student student) {
        this.student = student;
    }

    @Override
    public void sweep() {
        student.sweeping();
    }
}
