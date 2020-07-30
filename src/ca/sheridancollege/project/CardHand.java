/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author hommies
 */
public class CardHand {
     private int handSize = 52;
	public ArrayList<Card> cards = new ArrayList(handSize);
        public void generateHand()
        {
                int countCards = 0;
		for(Card.Suit s: Card.Suit.values())
                {
                    for(Card.Value v: Card.Value.values())
                    {
                        cards.add(new Card(s,v));
                        countCards++;
                    }
                }
        }
}
