package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private final List<EventListeners> messageListener;

    NotificationService() {
        messageListener = new ArrayList<>();
    }

    public void subscribe(EventListeners listener) { 
        messageListener.add(listener);
    }

    public void unsubscribe(EventListeners listener) {
        messageListener.remove(listener);
    }

    public void notifyNewItemAdded() {
        messageListener.forEach(listener -> listener.update());
    }
}
