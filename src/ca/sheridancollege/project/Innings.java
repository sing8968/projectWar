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
        ArrayList<Player> myPlayers = new ArrayList();
        myPlayers.add(new PlayersOfWar(player1));
        myPlayers.add(new PlayersOfWar(player2));
        WarGame war = new WarGame();
        war.setPlayers(myPlayers);
        for(Player p : war.players)
        {
           p.play();
           
        }
        war.play();
        //Players of the game
        
    }
}
