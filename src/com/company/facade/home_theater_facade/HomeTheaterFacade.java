package com.company.facade.home_theater_facade;

public class HomeTheaterFacade {
    Amplifier amplifier;
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;
    Projector projector;
    TheaterLights theaterLights;
    Screen screen;
    PopcornPopper popcornPopper;

    public HomeTheaterFacade(Amplifier amplifier,
                             Tuner tuner,
                             DvdPlayer dvdPlayer,
                             CdPlayer cdPlayer,
                             Projector projector,
                             TheaterLights theaterLights,
                             Screen screen,
                             PopcornPopper popcornPopper) {

        this.amplifier = amplifier;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.projector = projector;
        this.theaterLights = theaterLights;
        this.screen = screen;
        this.popcornPopper = popcornPopper;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch movie ...");
        popcornPopper.on();
        popcornPopper.pop();
        theaterLights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setDvd(dvdPlayer);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down ...");
        popcornPopper.off();
        theaterLights.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }

}
