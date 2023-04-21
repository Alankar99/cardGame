package com.psl.gems.client.TestClient;

import com.psl.gems.Entities.Card;
import com.psl.gems.Entities.Game;
import com.psl.gems.Entities.Player;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Card> deck = new ArrayList<>();

        String[] rankList= {
               "two",
               "three",
               "four",
               "five",
               "six",
               "seven",
               "eight",
               "nine",
               "ten",
               "jack",
               "queen",
               "king",
               "ace"};


        List<String> suitList = new ArrayList<>();
        suitList.add("club");
        suitList.add("diamond");
        suitList.add("heart");
        suitList.add("spade");

        for(int i=0 ; i<4 ; i++)
        {
            for(int j=0 ; j<=12 ; j++)
            {
                Card card = new Card();

                card.setRank(j);
                card.setSuit(i);

                String picName = "\\" + "images" + "\\" + suitList.get(i) + "\\" + rankList[i] + ".jpg";
                card.setPictureName(picName);

                deck.add(card);

            }
        }

        String player1 = "Kit";
        String player2 = "Kut";


        Game game = new Game();
        game.play(player1 , player2, deck);



    }
}