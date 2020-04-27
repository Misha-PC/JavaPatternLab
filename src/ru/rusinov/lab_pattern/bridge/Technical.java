package ru.rusinov.lab_pattern.bridge;

public abstract class Technical {

    protected ITransmission transmission;
    protected String        name;

    protected Technical(ITransmission transmission, String name){
        this.transmission = transmission;
        this.name         = name;
    }


    public abstract void making();

}
