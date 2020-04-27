package ru.rusinov.lab_pattern.bridge;

public class Tracks implements ITransmission {

    @Override
    public void getTransmissionType() {
        System.out.println("\tTransmission: Tracks");
    }

}
