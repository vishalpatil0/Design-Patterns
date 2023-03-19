package Behavioral.Observer;

public class EmailMessageListener implements EventListeners{
    private String email;

    EmailMessageListener(String email) {
        this.email = email;
    }

    @Override
    public void update() {
        System.out.println(email + " notified");
    }
}
