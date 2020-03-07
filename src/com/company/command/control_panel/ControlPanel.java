package com.company.command.control_panel;

import java.util.Arrays;

public class ControlPanel {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;


    public ControlPanel() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        defaultInitialization();
        undoCommand = new NoCommand();
    }

    private void defaultInitialization() {
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------------ Control Panel ------------\n");
        for (int i = 0; i < onCommands.length; i++){
            stringBuffer.append("[slot " + i + "] " +
                    onCommands[i].getClass().getName()+"\t" +
                    offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}
