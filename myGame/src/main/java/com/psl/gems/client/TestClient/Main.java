package com.psl.gems.client.TestClient;

import com.psl.gems.Entities.Card;
import com.psl.gems.Entities.Game;
import com.psl.gems.Entities.Player;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.io.FileWriter = new java.io.FileWriter("cardgame.html");

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

    StringBuilder html = new StringBuilder();
    html.append("<!DOCTYPE html>\n");
    html.append("<html lang=\"en\">\n");
    html.append("<head>\n");
    html.append("<title>Card Game</title>");
    html.append("<link rel = \"stylesheet\" href=\"cardgame.css\">\n");
    html.append("<script src=\"cardgame.js\"></script>\n");
    html.append("</head>\n");
    html.append("<body>\n");
    html.append("<div class = \"container\">\n");
    int i=0;
    for (Player player : players) {
      html.append("<div class=\"player\">\n");
      html.append("<div class=\"player-name\"><h2>" + player.getName() + "</h2></div>\n");
      html.append("<div class = \"cards\">\n");
      for (Card card : player.getCardsInHand()) {
        html.append("<div class=\"card \" id = \"" + card.getSuit() + card.getRank() + "\" onclick=\"flipCard(this.id," + i + ")\">\n");
        html.append("<div class=\"card-inner\">\n");
        html.append("<div class=\"card-back\"><img src=\"images/back.jpeg\" alt=\"back of card\"></div>\n");
        // html.append("<div class=\"card-back\"><img src=\"images/" + card.getSuit() + card.getRank() + ".png\" alt=\"front of card\" >\n");
        html.append("<div class=\"card-front\"><img src= \"" card.getPictureName()"></div>\n");


        html.append("</div></div></div>\n");
        
      }
      html.append("</div>\n");
      html.append("<button class=\"show-highest-card\" disabled id=\"btn"+ i + "\" onclick = \" showHighestCard(" + player.showHighestCard().getSuit() + ")\">Show Highest Card</button>\n");
      html.append("</div>\n");
      i++;
    }

    html.append("<button class=\"decide-winner\" disabled id = \"btnwinner\" onclick=\"decideWinner(btnwinner)\">Decide Winner</button>\n");
    html.append("</div>\n");
    html.append("</body>\n");
    html.append("</html>\n");



    }
}