package se.johan.lektion3.cardgame;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int value;
    private List<Card> hand;

    // Constructor

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public Player(String name, List<Card> hand) {
        this.name = name;
        this.hand = hand;
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
        if (value < 1) {
            value = -1;
        }
        this.value = value;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }
}
