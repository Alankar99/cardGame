package com.psl.gems.Entities;

import java.util.*;

public class Game {

    List<Player> players = new ArrayList<>();
    Player player1 = new Player();
    Player player2 = new Player();
    List<Card> deck = new ArrayList<>();

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void setPlayerNames(String playerName1 , String playerName2)
    {
        player1.setName(playerName1);
        player2.setName(playerName2);
    }

    public void play(String playerName1 , String playerName2, List<Card> deck)
    {
        Collections.shuffle(deck);
        setPlayerNames(playerName1 , playerName2);

        List<Card> p1 = new ArrayList<>();
        List<Card> p2 = new ArrayList<>();

        for (int i=0 ; i<6 ; i++)
        {
            if(i%2 == 0)
            {
                p1.add(deck.get(i));
            }
            else
            {
                p2.add(deck.get(i));
            }
        }
        player1.setCardsInHand(p1);
        player2.setCardsInHand(p2);
    }

    public void showHighCard()
    {
    }

}
