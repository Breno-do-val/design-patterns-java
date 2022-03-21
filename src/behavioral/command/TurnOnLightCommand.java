package behavioral.command;

public class TurnOnLightCommand implements Command {
    private SmartLightBulb receiver;

    public TurnOnLightCommand(SmartLightBulb receiver) {
        this.receiver = receiver;
    }

    @Override public void execute() {
        this.receiver.turnOnLight();
        System.out.println("The light is: " + receiver.isLightOn());
    }

    @Override public void unexecute() {
        this.receiver.turnOffLight();
        System.out.println("The light is: " + receiver.isLightOn());
    }
}
