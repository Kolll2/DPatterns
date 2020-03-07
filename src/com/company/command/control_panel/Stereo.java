package com.company.command.control_panel;

public class Stereo {
    private int volume = 5;
    String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on (){
        System.out.println(name +" stereo is on");
    }

    public void off(){
        System.out.println(name +" stereo is off");
    }

    public void setCD() {
        System.out.println(name +" CD is installed");
    }

    public void setRadio() {
        System.out.println(name +" radio is on");
    }


    public void setVolume(int vol) {
        this.volume = vol;
        System.out.println(name +" the volume level is set to " + volume);
    }
}
