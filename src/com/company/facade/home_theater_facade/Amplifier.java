package com.company.facade.home_theater_facade;

public class Amplifier {
    public void on() {
        System.out.println("Amplifier on");
    }

    public void setDvd(DvdPlayer dvdPlayer) {
        System.out.println("Amplifier settings DVD player" + dvdPlayer.toString());
    }

    public void setSurroundSound() {
        System.out.println("Amplifier surround sound on (5 speakers, 1 subwoofer)");
    }

    public void setVolume(int i) {
        System.out.println("Amplifier settings volume " + i);
    }

    public void off() {
        System.out.println("Amplifier off");
    }
}
