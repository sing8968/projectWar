/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author dancye
 */
public class GroupOfCards 
{   
    //the size of the grouping
    private int size;
    //The group of cards, stored in an ArrayList
    private ArrayList <Card> cards;
    public GroupOfCards() {
        this.cards = new ArrayList();
        size=26;
    }
    
    public GroupOfCards(int givenSize)
    {
        this.cards = new ArrayList();
        size = givenSize;
    }
    //First distribute the player 26 cards
        public void distributeCards()
    {
        CardHand masterHand = new CardHand();
        masterHand.generateHand();
        Collections.shuffle(masterHand.cards);
        for(int i=0; i<26;i++)
        {
            cards.add(masterHand.cards.get(i));
        }
    }
    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
    public ArrayList<Card> showCards()
    {
        return cards;
        
    }
    public void shuffle()
    {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }
    
    
}//end class
