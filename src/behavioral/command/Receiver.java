package behavioral.command;

public class Receiver {
    private boolean light;

    public void turnOn() {
        this.light = true;
        System.out.println("Receiver: The light is On");
    }

    public void turnOff() {
        this.light = false;
        System.out.println("Receiver: The light is Off");
    }

    public boolean isLightOn() {
        return light;
    }
}
