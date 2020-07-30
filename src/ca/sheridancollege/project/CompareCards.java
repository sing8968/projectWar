/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *This class compare the cards and change the score
 * @author hommies
 */
public class CompareCards {
//These data members handles score for both players
    private int score1, score2;
    //Constructor
    public CompareCards() {
        this.score1 = 26;
        this.score2 = 26;
    }
    public enum Value{ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};
    /**
     * 
     * @return Score of player 1
     */
    public int getScore1() 
    {
        return score1;
    }
    /**
     * 
     * @return Score of player 2
     */
    public int getScore2() 
    {
        return score2;
    }
    //This method change the score when the cards are diffrent
    public void peaceCode(int x)
    {
        if(x==0)
        {
            this.score1 = ++score1;
            this.score2 = --score2;
        }
        else
        {
            this.score2 = ++score2;
            this.score1 = --score1;
        }
    }
    //This method deals with the score change when condition of war is satisfied
    public void warCode(int x)
    {
        System.out.println("Here is the War");
        if(x==0)
        {
            this.score1= 3+score1;
            this.score2= score2-2;
        }
        else
        {
            this.score2= 3+score2;
            this.score1= score1-2;
        }
    }
    /**
     * This method compare the cards and then increase or decrease the score.
     * @param v1
     * @param v2 
     */
    public void compareCards(Card.Value v1,Card.Value v2)
    {
        int num1=0;
        int num2 = 0;
        int iteration = 0;        
        for(Value v : Value.values())
        {
            if(v.toString()==v1.toString()&& v.toString()==v2.toString())
            {
                warCode(0);
                break;
            }
            else if(v.toString()==v1.toString())
            {
                num1=iteration;
            }
            else if(v.toString()==v2.toString())
            {
                num2=iteration;
            }
            iteration++;
        }
        if(num1>num2)
        {
            peaceCode(0);
        }
        else
        {
            peaceCode(1);
        }
    }
}
