// Subsystem components
class DVDPlayer {
    void on() {
        System.out.println("DVD Player: Turning on");
    }

    void play(String movie) {
        System.out.println("DVD Player: Playing movie - " + movie);
    }

    void off() {
        System.out.println("DVD Player: Turning off");
    }
}

class Projector {
    void on() {
        System.out.println("Projector: Turning on");
    }

    void setInput(DVDPlayer dvdPlayer) {
        System.out.println("Projector: Setting input to DVD Player");
    }

    void off() {
        System.out.println("Projector: Turning off");
    }
}

class Lights {
    void dim(int level) {
        System.out.println("Lights: Dimming lights to level " + level);
    }

    void on() {
        System.out.println("Lights: Turning on");
    }
}

class SoundSystem {
    void on() {
        System.out.println("Sound System: Turning on");
    }

    void setVolume(int volume) {
        System.out.println("Sound System: Setting volume to " + volume);
    }

    void off() {
        System.out.println("Sound System: Turning off");
    }
}

// Facade class
class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private Lights lights;
    private SoundSystem soundSystem;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, Lights lights, SoundSystem soundSystem) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.lights = lights;
        this.soundSystem = soundSystem;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        lights.dim(10);
        projector.on();
        projector.setInput(dvdPlayer);
        dvdPlayer.on();
        dvdPlayer.play(movie);
        soundSystem.on();
        soundSystem.setVolume(8);
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        lights.on();
        projector.off();
        dvdPlayer.off();
        soundSystem.off();
    }
}

// Client code
public class HomeTheater {
    public static void main(String[] args) {
        // Create subsystem components
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        Lights lights = new Lights();
        SoundSystem soundSystem = new SoundSystem();

        // Create the facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, lights, soundSystem);

        // Watch a movie using the facade
        homeTheater.watchMovie("Inception");

        // End the movie using the facade
        homeTheater.endMovie();
    }
}
