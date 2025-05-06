package se.johan.lektion3.cardgame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DealerTest {
    // TODO - Bättre namn på alla test-metoder

    @Test
    void generateDeckTest() {
        Dealer dealer = new Dealer();
        dealer.generateDeck();
        assertEquals(52, dealer.getDeck().size());
    }


    @Test
    void shuffleTest() {
        Dealer dealerUnsorted =  new Dealer();
        dealerUnsorted.generateDeck();

        Dealer dealerSorted = new Dealer();
        dealerSorted.generateDeck();
        dealerSorted.shuffle();

        assertNotEquals(dealerSorted, dealerUnsorted);
    }

    @Test
    void discardTest() {
        Dealer dealerComplete =  new Dealer();
        dealerComplete.generateDeck();

        Dealer dealerMissing = new Dealer();
        dealerMissing.generateDeck();
        dealerMissing.discard(dealerMissing.getDeck());

        assertNotEquals(dealerMissing, dealerComplete);
    }

    @Test
    void generateSingleSuitUndressedTest() {
        Card card = new Card("clubs", 2);
        Dealer dealer = new Dealer();
        dealer.generateSingleSuitUndressed("clubs");
        assertEquals(card.getSuit(), dealer.getDeck().getFirst().getSuit());
    }

    @Test
    void generateSingleSuitDressedTest() {
        Card card = new Card("clubs", 10);
        Dealer dealer = new Dealer();
        dealer.generateSingleSuitDressed("clubs");
        assertEquals(card.getSuit(), dealer.getDeck().getFirst().getSuit());
    }
}