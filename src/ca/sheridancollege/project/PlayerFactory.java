/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author hommies
 */
public class PlayerFactory {
    private String name = "ToBeAssigned";

    public PlayerFactory() {
    }
    public static PlayersOfWar createPlayer(String name)
    {
        return new PlayersOfWar(name);
    }
}
