package ru.rusinov.lab_pattern.decorator;

public class DeveloperDecorator implements IDeveloper {

    IDeveloper developer;

    public DeveloperDecorator(IDeveloper developer) {
        this.developer = developer;
    }

    @Override
    public String writeCode() {
        return developer.writeCode();
    }
}
