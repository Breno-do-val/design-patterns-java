package behavioral.command;

public class TurnOffLightCommand implements Command{
    private SmartLightBulb receiver;

    public TurnOffLightCommand(SmartLightBulb receiver) {
        this.receiver = receiver;
    }

    @Override public void execute() {
        this.receiver.turnOffLight();
        System.out.println("The light is: " + receiver.isLightOn());
    }

    @Override public void unexecute() {
        this.receiver.turnOnLight();
        System.out.println("The light is: " + receiver.isLightOn());
    }
}
