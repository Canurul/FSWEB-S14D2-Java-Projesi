package model;
import enums.LampType;

public class Lamp {
    private LampType lampType;
    private boolean battery;
    private int globeTaring;

    public Lamp(LampType lampType, boolean battery, int globeTaring) {
        this.lampType = lampType;
        this.battery = battery;
        this.globeTaring = globeTaring;
    }
    public void turnedOn(){
        System.out.println("Lamp is being turned on.");
    }

    public LampType getLampType() {
        return this.lampType;
    }

    public boolean isBattery() {
        return this.battery;
    }

    public int getGlobeTaring() {
        return this.globeTaring;
    }
}

