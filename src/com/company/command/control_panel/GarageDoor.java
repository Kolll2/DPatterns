package com.company.command.control_panel;

public class GarageDoor {
    String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    public void up() {
        System.out.println("Garage door is open");
    }

    public void down() {
        System.out.println("Garage door is closed");
    }

    public void stop() {
        System.out.println("The movement of the garage door is stopped");
    }

    public void lightOn() {
        System.out.println("The light is garage is enabled");
    }

    public void lightOff() {
        System.out.println("The light is garage is disabled");
    }
}
