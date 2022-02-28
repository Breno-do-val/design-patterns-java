package behavioral.command;

public class TurnOffCommand implements Command {
    private Receiver receiver;

    public TurnOffCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override public void execute() {
        this.receiver.turnOff();
        System.out.println("The light is: " + receiver.isLightOn());
    }

    @Override public void unexecute() {
        this.receiver.turnOn();
        System.out.println("The light is: " + receiver.isLightOn());
    }
}
