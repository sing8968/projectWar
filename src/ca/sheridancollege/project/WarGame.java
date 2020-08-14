/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;
/**
 *This is the controller class
 * @author Group Hommies
 */
public class WarGame extends Game {
    private WarGame() {
        super("war");
    }    
    private static WarGame object = null;
    CompareCards compCards = new CompareCards();
    @Override
    //Well as per the OOP principles i have designed the program to achieve delegation, cohesion and loose coupling
    //This method only deals with showing the cards and then it calls another method to compare the cards.
    //finally this method also declare the winner.
    public void play() {
        int count = 0;        
        Card.Value v1 = Card.Value.ACE;
        Card.Value v2 = Card.Value.ACE;
        for(int i = 0; i<26; i++)
        {
            int iterationForAdvancedForLoop = 0;
            for(Player p : players)
            {
                System.out.println(p+" has "+ p.getCardsOfPlayer().get(count).getValue() +" of "+p.getCardsOfPlayer().get(count).getSuit() );
                if(iterationForAdvancedForLoop==0)
                {
                     v1 = p.getCardsOfPlayer().get(count).getValue();
                     iterationForAdvancedForLoop++;
                }
                else
                {
                    v2 = p.getCardsOfPlayer().get(count).getValue();
                     iterationForAdvancedForLoop=0;
                }                
            }
            compCards.compareCards(v1,v2);
            System.out.println("Score of "+ players.get(0).toString() + " is "+ compCards.getScore1());
            System.out.println("Score of "+ players.get(1).toString() + " is "+ compCards.getScore2());
            System.out.println("------------------------------------------");
            count++;
        }
     declareWinner();   
    }
    @Override
    public void declareWinner() {
        if(compCards.getScore1()>compCards.getScore2())
        {
            System.out.println(players.get(0).getPlayerID() + " is winner");
        }
        else
        {
            System.out.println(players.get(1).getPlayerID() + " is winner");
        }
    }
    public static WarGame getInstance()
    {
        object=new WarGame();
        return object;
    }
}
