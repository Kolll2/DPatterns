package com.company.command.structure;

import java.util.Stack;

public class CommandOne implements Command {

    Stack<String> commands = new Stack<>();
    int index = 0;

    @Override
    public void execute() {
        System.out.println("execute command one # " + index);
        commands.push("execute command one # " + index++);
    }

    @Override
    public void undo() {
        if (commands.size() > 0) {
            String pop = commands.pop();
            System.out.println("undo command \"" + pop + "\"");
        }
    }
}
