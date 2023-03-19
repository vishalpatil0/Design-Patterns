
abstract class Game {
    void play() {
        downloadData();
        extractData();
        loadData();
        processData();
    }

    abstract void downloadData();
    abstract void extractData();
    abstract void loadData();
    abstract void processData();
}

class Cricket extends Game {

    @Override
    void downloadData() {
        System.out.println("Downloading cricket data......");
    }

    @Override
    void extractData() {
        System.out.println("Extracting cricket data......");
    }

    @Override
    void loadData() {
        System.out.println("Loading cricket data......");
    }

    @Override
    void processData() {
        System.out.println("Processing cricket data......");
    }

}

class FootBall extends Game {

    @Override
    void downloadData() {
        System.out.println("Downloading football data......");
    }

    @Override
    void extractData() {
        System.out.println("Extracting football data......");
    }

    @Override
    void loadData() {
        System.out.println("Loading football data......");
    }

    @Override
    void processData() {
        System.out.println("Processing football data......");
    }
}

public class Template {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        game = new FootBall();
        game.play();
    }
}
