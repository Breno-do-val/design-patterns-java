package behavioral.command;

public class TurnOnCommand implements Command {
    private Receiver receiver;

    public TurnOnCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override public void execute() {
        this.receiver.turnOn();
        System.out.println("The light is: " + receiver.isLightOn());
    }

    @Override public void unexecute() {
        this.receiver.turnOff();
        System.out.println("The light is: " + receiver.isLightOn());
    }
}
