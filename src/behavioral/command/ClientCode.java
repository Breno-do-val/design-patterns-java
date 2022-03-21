package behavioral.command;

public class ClientCode {
    public static void main(String[] args) {
        SmartLightBulb receiver = new SmartLightBulb();

        Invoker wifiInvoker = new Invoker(new TurnOnWifiCommand(receiver), new TurnOffWifiCommand(receiver));
        Invoker lightInvoker = new Invoker(new TurnOnLightCommand(receiver), new TurnOffLightCommand(receiver));

        // Invoker for wi-fi manipulation
        wifiInvoker.turnOn();
        wifiInvoker.turnOff();

        // Invoker for light manipulation
        lightInvoker.turnOn();
        lightInvoker.turnOff();
    }
}
