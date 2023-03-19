package Behavioral.Observer;

public class Store {
    NotificationService notificationService;

    Store() {
        notificationService = new NotificationService();
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }

    public void NewItem() {
        notificationService.notifyNewItemAdded();
    }
}
