package Behavioral.Command;

public class Remote {
    Command command;

    public Remote() {}
    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonPressed() {
        command.execute();
}
}
