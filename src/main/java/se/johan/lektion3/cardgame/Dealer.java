package se.johan.lektion3.cardgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dealer {


    private List<Card> deck = new ArrayList<>();

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

    // Genererar alla kort mellan 1 - 10
    // TODO - Skapa en metod för att omvandla ett ess till 11 om det passar handen bättre.
    void generateSingleSuitUndressed(String name) {
        for (int i = 2; i <= 9; i++) {
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

    void generateAce(String name) {
        Card card = new Card(name, 11);
        deck.add(card);
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


    void giveCard(Player player) {
        player.draw(deck.getFirst());
        discard(deck);
    }

    void calculatePlayerValue(Player player) {
        int sum = 0;
        for (int i = 0; i < player.getHand().size(); i++) {
            sum += player.getHand().get(i).getValue();
        }
        player.setValue(sum);
    }

}
