package behavioral.command;

public class TurnOnWifiCommand implements Command {
    private SmartLightBulb receiver;

    public TurnOnWifiCommand(SmartLightBulb receiver) {
        this.receiver = receiver;
    }

    @Override public void execute() {
        this.receiver.turnOnWifi();
        System.out.println("The wifi is: " + receiver.isWifiOn());
    }

    @Override public void unexecute() {
        this.receiver.turnOffWifi();
        System.out.println("The wifi is: " + receiver.isWifiOn());
    }
}
