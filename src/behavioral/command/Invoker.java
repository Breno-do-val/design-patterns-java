package behavioral.command;

public class Invoker {
    private Command turnOnCommand;
    private Command turnOffCommand;

    public Invoker(Command turnOn, Command turnOff) {
        this.turnOnCommand = turnOn;
        this.turnOffCommand = turnOff;
    }

    public void turnOn() {
        this.turnOnCommand.execute();
    }

    public void turnOff() {
        this.turnOffCommand.execute();
    }
}
