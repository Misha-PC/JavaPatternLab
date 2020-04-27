package ru.rusinov.lab_pattern.adapter;

public class AdaptedConcretClass extends FirstConcretClass implements IAdapter{


    @Override
    public String muchNeededFunc(int x, String spacer) {
        x = x >= 0? x : -x;

        String repeatName = new String();

        for (int i = 0; i < x; i++)
            repeatName += name + spacer;

        return repeatName;
    }
}
