package ru.rusinov.lab_pattern.bridge;

public class Tank extends  Technical {

    public Tank(ITransmission transmission, String name) {
        super(transmission, name);
    }

    @Override
    public void making() {
        System.out.println("Technical factory created Tank(" + name + "):");
        transmission.getTransmissionType();
    }
}
