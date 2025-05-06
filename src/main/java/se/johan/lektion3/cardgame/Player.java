package se.johan.lektion3.cardgame;

import java.util.List;

public class Player {
    private String name;
    private int value;
    private List<Card> hand;

    // Constructor

    public Player(String name) {
        this.name = name;
    }
    // Methods


    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if(value < 1) {
            value = -1;
        }
        this.value = value;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }
}
