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
        // 1(äss) - 10
        generateSingleSuitUndressed("clubs");
        generateSingleSuitUndressed("diamonds");
        generateSingleSuitUndressed("hearts");
        generateSingleSuitUndressed("spades");
        // Klädda kort (alla är värda 10)
        generateSingleSuitDressed("clubs");
        generateSingleSuitDressed("diamonds");
        generateSingleSuitDressed("hearts");
        generateSingleSuitDressed("spades");

    }

    // Genererar alla kort mellan 1 - 10
    // TODO - Skapa en metod för att omvandla ett ess till 11 om det passar handen bättre.
    void generateSingleSuitUndressed(String name) {
        for (int i = 1; i <= 9; i++) {
            Card card = new Card(name, i);
            deck.add(card);
        }
    }

    void generateSingleSuitDressed(String name) {
        for (int i = 0; i <= 3; i++) {
            Card card = new Card(name, 10);
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

    void giveCard(Player player) {
        player.getHand().add(deck.getFirst());
        discard(deck);
    }

}
