package ru.rusinov.lab_pattern;

import ru.rusinov.lab_pattern.adapter.AdaptedConcretClass;
import ru.rusinov.lab_pattern.adapter.FirstConcretClass;
import ru.rusinov.lab_pattern.bridge.*;
import ru.rusinov.lab_pattern.composite.IPlayer;
import ru.rusinov.lab_pattern.composite.Scout;
import ru.rusinov.lab_pattern.composite.Sniper;
import ru.rusinov.lab_pattern.composite.Team;
import ru.rusinov.lab_pattern.decorator.IDeveloper;
import ru.rusinov.lab_pattern.decorator.PythonJuniorDeveloper;
import ru.rusinov.lab_pattern.decorator.PythonMiddleDeveloper;
import ru.rusinov.lab_pattern.decorator.PythonTeamLead;

public class Main    {
    public static void main(String[] args) {

        // case 1, Adapter
        showAdapter();

        // case 2, Bridge
        showBridge();

        // case 3, composite
        showComposite();

        // case 4, Decorator
        showDecorator();

        // case 5, Facade
        // case 6, Flyweight
        // case 7, Proxy

    }

    public static void showAdapter(){
        System.out.println("#-------- Adapter -------#");

        FirstConcretClass   first   = new FirstConcretClass();
        AdaptedConcretClass adapted = new AdaptedConcretClass();

        first.setName   (
                "I'm not modified class, I have'nt function 'muchNeededFunc' ;( "
        );

        adapted.setName(
                "I'm modified class!! I can flood message using function 'muchNeededFunc' :))! Look! "
        );


        System.out.println(first.getName());                            //It's work!
        System.out.println(adapted.getName() + "\n");                   //It's work to!

        System.out.println(adapted.muchNeededFunc(2, "\n")); //It's and
                                                                        //but..
      //System.out.println(first.muchNeededFunc(2, "\n"));              //It's not work because
                                                                        // basic class don't have Interface
                                                                        // IAdapter with function "muchNeededFunc()"

    }

    public static void showBridge(){
        System.out.println("#-------- Bridge -------#");

        TechnicalFactory factory = new TechnicalFactory();

        Technical[] pack = {
                new Tank(new Tracks(), "T100-LT"),
                new Tank(new Wheels(), "EBR-105"),

                new Tractor(new Tracks(), "ТТ-4М"),
                new Tractor(new Wheels(), "K744 P3"),
        };

        factory.setTechicals(pack);
        factory.start();


    }

    public static void showComposite(){
        System.out.println("#-------- Composite -------#");

        Team team = new Team();

        IPlayer ivan   = new Scout();
        IPlayer andreo = new Scout();
        IPlayer diman  = new Sniper();
        IPlayer sniper = new Sniper();

        team.addPlayer(ivan);
        team.addPlayer(andreo);
        team.addPlayer(diman);
        team.addPlayer(sniper);

        team.loadPlayers();
    }

    public static void  showDecorator(){
        System.out.println("#-------- Decorator -------#");

        IDeveloper junior   = new PythonJuniorDeveloper();          //питонист обычный  сложность минимильная
        IDeveloper middle   = new PythonMiddleDeveloper(junior);    //питонист лвл2     сложность + 1
        IDeveloper teamLead = new PythonTeamLead(middle);           //питонист макс.лвл сложность + 1 + 1


        System.out.println( junior .writeCode());
        System.out.println( middle .writeCode());
        System.out.println(teamLead.writeCode());


    }

}
