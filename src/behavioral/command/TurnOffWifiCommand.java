package behavioral.command;

public class TurnOffWifiCommand implements Command {
    private SmartLightBulb receiver;

    public TurnOffWifiCommand(SmartLightBulb receiver) {
        this.receiver = receiver;
    }

    @Override public void execute() {
        this.receiver.turnOffWifi();
        System.out.println("The wifi is: " + receiver.isWifiOn());
    }

    @Override public void unexecute() {
        this.receiver.turnOnWifi();
        System.out.println("The wifi is: " + receiver.isWifiOn());
    }
}
