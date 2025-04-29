package se.johan.lektion3.cardgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
        for (int i = 1; i <= 13; i++) {
            Card card = new Card(name, i);
            deck.add(card);
        }
    }

    void shuffle() {
        Random random = new Random();
        int randomNum = random.nextInt(51);
        for (int i = 0; i < 52; i++) {
            Card card = deck.get(randomNum);
            deck.set(i, card);
        }
    }

    void discard(List<Card> deck) {
        deck.removeFirst();
    }

    void drawCard(List<Card> deck) {
        System.out.println(deck.getFirst());
    }

}
