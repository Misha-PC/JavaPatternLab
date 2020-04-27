package ru.rusinov.lab_pattern.bridge;

public class Tractor extends Technical {

    public Tractor(ITransmission transmission, String name) {
        super(transmission, name);
    }

    @Override
    public void making() {
        System.out.println("Technical factory created Tractor(" + name + "):");
        transmission.getTransmissionType();
    }
}
