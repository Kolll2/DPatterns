package com.company.command.control_panel;

public class Main {
    public static void main(String[] args) {
        // Light test 1
        ControlPanel controlPanel = new ControlPanel();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        controlPanel.setCommand(lightOn);
        controlPanel.buttonWasPressed();


        //Garage door test 1
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        controlPanel.setCommand(garageDoorOpenCommand);
        controlPanel.buttonWasPressed();
    }
}
