package se.johan.lektion3.cardgame.model;


public class Card {
    private String suit;
    private int value;

    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }


    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        if (suit.isBlank()) {
            suit = "Suit can't be empty";
        }
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if(value < 1 || value > 11) {
            value = -1;
        }
        this.value = value;
    }
}
