package ru.rusinov.lab_pattern.decorator;

public class PythonMiddleDeveloper extends DeveloperDecorator {

    public PythonMiddleDeveloper(IDeveloper developer) {
        super(developer);
    }
    public String pushTasks(){
         return "Push tasks. ";
    }

    @Override
    public String writeCode() {
        return super.writeCode() + pushTasks();
    }
}
