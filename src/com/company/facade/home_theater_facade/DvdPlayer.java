package com.company.facade.home_theater_facade;

public class DvdPlayer {
    String movie;

    public void on() {
        System.out.println("DVD Player on");
    }

    public void play(String movie) {
        this.movie = movie;
        System.out.println("DVD Player playing \"" + movie + "\"");
    }

    public void stop() {
        System.out.println("DVD Player playing \"" + movie + "\"");
    }

    public void eject() {
        System.out.println("DVD Player eject");
    }

    public void off() {
        System.out.println("DVD Player off");
    }
}
