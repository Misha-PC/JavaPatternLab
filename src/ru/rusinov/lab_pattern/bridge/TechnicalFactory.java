package ru.rusinov.lab_pattern.bridge;

public class TechnicalFactory {
    private Technical[] techicals;

//    public TechnicalFactory(Technical[] techicals){
//        this.techicals = techicals;
//
//    }

    public void setTechicals(Technical[] techicals) {
        this.techicals = techicals;
    }

    public void start(){

        for(Technical technical: techicals){
            technical.making();
            System.out.println();
        }

    }
}
