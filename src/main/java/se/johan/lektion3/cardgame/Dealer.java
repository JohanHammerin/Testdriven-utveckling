package se.johan.lektion3.cardgame;

import java.util.ArrayList;
import java.util.List;

public class Dealer {


    private List<Card> deck = new ArrayList<>();

    public List<Card> getDeck() {
        return deck;
    }

    public void setDeck(List<Card> deck) {
        this.deck = deck;
    }

    void generateDeck() {
        generateSingleSuit("clubs");
        generateSingleSuit("diamonds");
        generateSingleSuit("hearts");
        generateSingleSuit("spades");
    }

    void generateSingleSuit(String name) {
        for (int i = 1; i < 14; i++) {
            Card card = new Card(name, i);
            deck.add(card);
        }
    }
}
