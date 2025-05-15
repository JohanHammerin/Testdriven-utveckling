package se.johan.lektion3.cardgame.controller;

import se.johan.lektion3.cardgame.model.Card;
import se.johan.lektion3.cardgame.model.Player;

import java.util.*;

public class Dealer {


    List<Card> deck = new ArrayList<>();

    public List<Card> getDeck() {
        return deck;
    }


    public void generateDeck() {
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

    public void generateSingleSuitUndressed(String name) {
        for (int i = 2; i <= 10; i++) {
            Card card = new Card(name, i);
            deck.add(card);
        }
    }

    public void generateSingleSuitDressed(String name) {
        for (int i = 0; i <= 2; i++) {
            Card card = new Card(name, 10);
            deck.add(card);
        }
    }

    void generateAce(String name) {
        Card card = new Card(name, 11);
        deck.add(card);
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public void discard() {
        deck.removeFirst();
    }


    public void giveCard(Player player) {
        player.draw(deck.getFirst());
        discard();
    }

    public void calculatePlayerValue(Player player) {
        int sum = 0;
        for (int i = 0; i < player.getHand().size(); i++) {
            sum += player.getHand().get(i).getValue();
        }
        player.setValue(sum);
    }

}
