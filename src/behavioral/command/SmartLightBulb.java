package behavioral.command;

public class SmartLightBulb {
    private boolean light;
    private boolean wifi;

    public void turnOnLight() {
        this.light = true;
        System.out.println("Receiver: The light is On");
    }

    public void turnOffLight() {
        this.light = false;
        System.out.println("Receiver: The light is Off");
    }

    public boolean isLightOn() {
        return light;
    }

    public void turnOffWifi() {
        System.out.println("Receiver: The Wifi is Off");
        this.wifi = false;
    }
    public void turnOnWifi() {
        System.out.println("Receiver: The Wifi is On");
        this.wifi = true;
    }

    public boolean isWifiOn() {
        return wifi;
    }

}
