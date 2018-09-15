package com.sun.zq.design.command;

public class Invoke {
    private ICommand command;

    public Invoke(ICommand command) {
        this.command = command;
    }

    public void execute(){
        command.sweep();
    }
}
