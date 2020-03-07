package com.company.command.control_panel;

public class ControlPanel {
    Command slot;

    public ControlPanel() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
