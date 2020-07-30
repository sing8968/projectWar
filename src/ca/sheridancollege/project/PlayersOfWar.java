/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class PlayersOfWar extends Player{

    public PlayersOfWar(String name) {
        super(name);
    }
     
    
    @Override
    public void play() {
       GroupOfCards hand26 = new GroupOfCards();
       hand26.distributeCards();
       cardsOfPlayer = hand26.showCards();
    }

   
    @Override
    public String toString()
    {
        return getPlayerID();
    }
}
