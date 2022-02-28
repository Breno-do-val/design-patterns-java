package behavioral.command;

public class ClientCode {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        Invoker invoker = new Invoker(new TurnOnCommand(receiver), new TurnOffCommand(receiver));

        invoker.turnOn();
        invoker.turnOff();
    }
}
