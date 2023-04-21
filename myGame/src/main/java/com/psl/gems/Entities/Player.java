package com.psl.gems.Entities;

import java.util.*;

public class Player extends Game{
    String name;

    List<Card> cardsInHand = new ArrayList<>();

    public Player() {
    }

    public Player(String name, List<Card> cardsInHand) {
        this.name = name;
        this.cardsInHand = cardsInHand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Card> getCardsInHand() {
        return cardsInHand;
    }

    public void setCardsInHand(List<Card> cardsInHand) {
        this.cardsInHand = cardsInHand;
    }


}
