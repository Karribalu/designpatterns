package org.bala.CommandPattern;

public class Button {
    private ICommand command;

    Button(ICommand command) {
        this.command = command;
    }

    public void click() {
        this.command.execute();
    }
}
