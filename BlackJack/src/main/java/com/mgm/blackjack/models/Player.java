package com.mgm.blackjack.models;

public class Player {

    private String name;
    private Hand hand;

    public Player(String name, Hand hand) {
        this.name = name;
        this.hand = hand;
    }

    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }

    public int getHandValue() {
        return hand.getValue();
    }

    public void addCardToHand(Card card) {
        hand.deal(card);
    }

    public void displayHand() {
        System.out.println(name + "'s Hand: " + hand.getSize() + " cards - Value: " + getHandValue());
    }
}
