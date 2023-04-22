package com.psl.gems.client.TestClient;

import com.psl.gems.Entities.Card;
import com.psl.gems.Entities.Game;
import com.psl.gems.Entities.PackOfCards;
import com.psl.gems.Entities.Player;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String player1 = "Kit";
        String player2 = "Kut";

//        System.out.println("step1");
        PackOfCards deck = new PackOfCards();
        deck.setFullPack();
//        System.out.println("step2");

        Game game = new Game();
//        System.out.println("Step3");
        game.play(player1 , player2);
//        System.out.println("Step4");

        game.displayCardsInHand();
        System.out.println("---------");
//        game.displayFullPack();
//        System.out.println("Step5");
        // Call game.showHighCard when button(Show high cards) is clicked in front-end after all cards are opened

        List<Card> highCardsList = game.showHighCard();
        for(Card card : highCardsList)
        {
            System.out.println(card.getSuit() +" "+ card.getRank());
            System.out.println("Value = "+card.getValue());
            System.out.println("---------");
        }

        System.out.println("Results");
        // Call game.displayWinner when button(Show Winner) is clicked in front-end.
        System.out.println(game.DisplayWinner().getName());
    }
}