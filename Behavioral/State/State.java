

interface MobileAlertState {
    void alert();
}

class Vibration implements MobileAlertState {
    
    @Override
    public void alert() {
        System.out.println("Vibration: notification");
    }
}

class Silent implements MobileAlertState {

    @Override
    public void alert() {
        System.out.println("Silent: notification");
    }
}

class AlertContext {
    MobileAlertState state;

    public MobileAlertState getState() {
        return state;
    }

    public void setState(MobileAlertState state) {
        this.state = state;
    }

    public void alert() {
        state.alert();
    }
}

public class State {
    public static void main(String[] args) {
        AlertContext context = new AlertContext();
        context.setState(new Vibration());
        context.alert();
        context.alert();
        context.setState(new Silent());
        context.alert();
    }
}
