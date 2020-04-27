package ru.rusinov.lab_pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<IPlayer> players = new ArrayList<IPlayer>();

    public void addPlayer(IPlayer player){
        players.add(player);
    }

    public void removePlayer(IPlayer player){
        players.remove(player);
    }

    public void loadPlayers(){
        System.out.println("load team...\n");
        for(IPlayer player: players){
            player.cocnect();
        }
    }

}
