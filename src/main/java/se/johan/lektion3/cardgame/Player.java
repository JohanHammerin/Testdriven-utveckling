package se.johan.lektion3.cardgame;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private int value;
    private List<Card> hand;


    public Player() {
        this.hand = new ArrayList<>();
    }

    public Player(List<Card> hand) {
        this.hand = hand;
    }

    public Player(int value) {
        this.value = value;
    }


    // Methods


    // Getters & Setters


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value < 1) {
            value = -1;
        }
        this.value = value;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void draw(Card card) {
        hand.add(card);
    }

}
