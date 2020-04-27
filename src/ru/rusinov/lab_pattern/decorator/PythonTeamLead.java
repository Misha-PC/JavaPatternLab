package ru.rusinov.lab_pattern.decorator;

public class PythonTeamLead extends DeveloperDecorator {

    public PythonTeamLead(IDeveloper developer) {
        super(developer);
    }

    public String sendWeekReport(){
        return "Send week report. ";
    }

    @Override
    public String writeCode() {
        return super.writeCode() + sendWeekReport();
    }
}
