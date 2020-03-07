package com.company.command.control_panel;

public class Main {
    public static void main(String[] args) {
        ControlPanel controlPanel = new ControlPanel();

        // Initializing gadgets
        Light livingRoomLight = new Light("Living room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living room");

        // Sets commands for manage lights
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        // Sets commands for ceiling fan
        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(ceilingFan);

        // Sets commands for garage door
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);

        // Sets commands for Stereo with CD
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOffWithCD = new StereoOffWithCDCommand(stereo);

        // programming the keys on the control panel
        controlPanel.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        controlPanel.setCommand(1,kitchenLightOn, kitchenLightOff);
        controlPanel.setCommand(2,ceilingFanOn, ceilingFanOff);
        controlPanel.setCommand(3,garageDoorOpen, garageDoorClose);
        controlPanel.setCommand(4,stereoOnWithCD, stereoOffWithCD);
        controlPanel.setCommand(5, ceilingFanLow,ceilingFanMedium);
        controlPanel.setCommand(6, ceilingFanHigh,ceilingFanOff);


        System.out.println(controlPanel);

        controlPanel.onButtonWasPressed(0);
        controlPanel.offButtonWasPressed(0);
        controlPanel.onButtonWasPressed(1);
        controlPanel.offButtonWasPressed(1);
        System.out.println("    The undo button is pressed   >>");
        controlPanel.undoButtonWasPushed();
        controlPanel.onButtonWasPressed(2);
        controlPanel.offButtonWasPressed(2);
        controlPanel.onButtonWasPressed(3);
        controlPanel.offButtonWasPressed(3);
        controlPanel.onButtonWasPressed(4);
        controlPanel.offButtonWasPressed(4);
        System.out.println("    The undo button is pressed   >>");
        controlPanel.undoButtonWasPushed();
        controlPanel.onButtonWasPressed(5);
        controlPanel.offButtonWasPressed(5);
        controlPanel.onButtonWasPressed(6);
        controlPanel.offButtonWasPressed(6);
        System.out.println("    The undo button is pressed   >>");
        controlPanel.undoButtonWasPushed();



    }
}
