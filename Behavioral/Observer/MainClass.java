package Behavioral.Observer;

public class MainClass {
    public static void main(String[] args) {
        Store store = new Store();
        store.getNotificationService().subscribe(new EmailMessageListener("vishal@gmail.com"));
        store.getNotificationService().subscribe(new EmailMessageListener("patil@gmail.com"));
        store.getNotificationService().subscribe(new EmailMessageListener("vp@gmail.com"));
        store.getNotificationService().subscribe(new MobileMessageListener("vihsalgpat"));
        store.NewItem();
    }
}
