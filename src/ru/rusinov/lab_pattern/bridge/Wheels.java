package ru.rusinov.lab_pattern.bridge;

public class Wheels implements ITransmission {

    @Override
    public void getTransmissionType() {
        System.out.println("\tTransmission: Wheels");
    }
}
