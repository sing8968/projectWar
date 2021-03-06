/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author dancye, 2018
 * @modifier Hommies
 */
public abstract class Player 
{
    private String playerID; //the unique ID for this player
    public ArrayList<Card> cardsOfPlayer;

    public ArrayList<Card> getCardsOfPlayer() {
        return cardsOfPlayer;
    }

    public void setCardsOfPlayer(ArrayList<Card> cardsOfPlayer) {
        this.cardsOfPlayer = cardsOfPlayer;
    }
    /**
     * A constructor that allows you to set the player's unique ID
     * @param name the unique ID to assign to this player.
     */
    public Player(String name)
    {
        playerID= name;
    }
    
    /**
     * @return the playerID
     */
    public String getPlayerID() 
    {
        return playerID;
    }

    /**
     * Ensure that the playerID is unique
     * @param givenID the playerID to set
     */
    public void setPlayerID(String givenID) 
    {
        playerID = givenID;
    }
    
}
