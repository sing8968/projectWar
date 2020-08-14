/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * This is the view Class of the Project
 * @author hommies
 */
public class Innings {
    public static void main(String[] args) {
        //Here I will take user's name.
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter the name of first player");
        String player1 = input.nextLine();
        System.out.println("Enter the name of second player");
        String player2 = input.nextLine();
        //This arraylist contains the player objects
        ArrayList<PlayersOfWar> myPlayers = new ArrayList();
        myPlayers.add(PlayerFactory.createPlayer(player1));
        myPlayers.add(PlayerFactory.createPlayer(player2));
        WarGame war = WarGame.getInstance();
        war.setPlayers(myPlayers);
        //This loop helps to distribute the cards to each player
        for(PlayersOfWar p : war.players)
        {
           p.distributeCards();           
        }
        //This call of play method will begin the game
        war.play();        
    }
}
