package ru.rusinov.lab_pattern;

import ru.rusinov.lab_pattern.adapter.AdaptedConcretClass;
import ru.rusinov.lab_pattern.adapter.FirstConcretClass;

public class Main    {
    public static void main(String[] args) {

        // case 1, Adapter
        showAdapter();

        // case 2, Bridge

        // case 3, composite
        // case 4, Decorator
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



    }

}
