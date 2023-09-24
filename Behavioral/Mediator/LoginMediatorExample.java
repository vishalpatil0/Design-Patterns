interface Mediator {
    void execute();
}

class LoginScreen implements Mediator {

    String id, passwd;

    @Override
    public void execute() {
        login();
    }

    private void login() {
        //Fectching id and pswd from text boxes
        id = "id";
        passwd = "password";
        //Authentication
        System.out.println("Validating id and password......");
    }
    
}

class LoginButton {
    private Mediator mediator;

    void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    void onClick() {
        mediator.execute();
    }
}

public class LoginMediatorExample {
    public static void main(String[] args) {
        Mediator lg = new  LoginScreen();
        LoginButton button = new LoginButton();
        button.setMediator(lg);
        button.onClick();
    }
}
