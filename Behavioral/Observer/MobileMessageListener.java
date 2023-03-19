package Behavioral.Observer;

public class MobileMessageListener implements EventListeners{

    String user;

    MobileMessageListener(String user) {
        this.user = user;
    }
    @Override
    public void update() {
        System.out.println(user + "notified");
    }
}
