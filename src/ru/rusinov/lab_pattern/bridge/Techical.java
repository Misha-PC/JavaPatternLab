package ru.rusinov.lab_pattern.bridge;

public abstract class Techical {

    protected Transmission transmission;

    protected Techical(Transmission transmission){
        this.transmission = transmission;
    }

    public abstract void making();

}
