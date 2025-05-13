package se.johan.lektion3.cardgame;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player {
    private String name;
    private int value;
    private List<Card> hand;

    // Constructor

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public Player(String name, List<Card> hand) {
        this.name = name;
        this.hand = hand;
    }

    public Player(String name, int value) {
        this.name = name;
        this.value = value;
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

    public void draw(Card card) {
        hand.add(card);
    }

}
