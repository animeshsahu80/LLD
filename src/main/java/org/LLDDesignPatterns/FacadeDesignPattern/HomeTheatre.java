package org.LLDDesignPatterns.FacadeDesignPattern;

// Subsystem Classes
class DVDPlayer {
    public void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }
}

class Amplifier {
    public void on() {
        System.out.println("Amplifier is ON");
    }
}

class Projector {
    public void on() {
        System.out.println("Projector is ON");
    }
}

class Lights {
    public void dim() {
        System.out.println("Lights are dimmed");
    }
}

// Facade Class
class HomeTheaterFacade {
    private DVDPlayer dvd;
    private Amplifier amp;
    private Projector projector;
    private Lights lights;

    public HomeTheaterFacade(DVDPlayer dvd, Amplifier amp, Projector projector, Lights lights) {
        this.dvd = dvd;
        this.amp = amp;
        this.projector = projector;
        this.lights = lights;
    }

    public void watchMovie(String movie) {
        System.out.println("Preparing to watch a movie...");
        lights.dim();
        projector.on();
        amp.on();
        dvd.play(movie);
    }
}

// Client Code
public class HomeTheatre {
    public static void main(String[] args) {
        DVDPlayer dvd = new DVDPlayer();
        Amplifier amp = new Amplifier();
        Projector projector = new Projector();
        Lights lights = new Lights();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvd, amp, projector, lights);
        homeTheater.watchMovie("Inception");
    }
}

