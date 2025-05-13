package se.johan.lektion3.cardgame;

import java.util.*;

public class Dealer {


    List<Card> deck = new ArrayList<>();

    public List<Card> getDeck() {
        return deck;
    }


    void generateDeck() {
        // 2 - 9
        generateSingleSuitUndressed("clubs");
        generateSingleSuitUndressed("diamonds");
        generateSingleSuitUndressed("hearts");
        generateSingleSuitUndressed("spades");
        // Klädda kort (alla är värda 10)
        generateSingleSuitDressed("clubs");
        generateSingleSuitDressed("diamonds");
        generateSingleSuitDressed("hearts");
        generateSingleSuitDressed("spades");

        // Äss
        generateAce("clubs");
        generateAce("diamonds");
        generateAce("hearts");
        generateAce("spades");


    }

    void generateSingleSuitUndressed(String name) {
        for (int i = 2; i <= 10; i++) {
            Card card = new Card(name, i);
            deck.add(card);
        }
    }

    void generateSingleSuitDressed(String name) {
        for (int i = 0; i <= 2; i++) {
            Card card = new Card(name, 10);
            deck.add(card);
        }
    }

    void generateAce(String name) {
        Card card = new Card(name, 11);
        deck.add(card);
    }

    void shuffle() {
        Collections.shuffle(deck);
    }

    void discard() {
        deck.removeFirst();
    }


    void giveCard(Player player) {
        player.draw(deck.getFirst());
        discard();
    }

    void calculatePlayerValue(Player player) {
        int sum = 0;
        for (int i = 0; i < player.getHand().size(); i++) {
            sum += player.getHand().get(i).getValue();
        }
        player.setValue(sum);
    }

}
