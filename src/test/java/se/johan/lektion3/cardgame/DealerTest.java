package se.johan.lektion3.cardgame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DealerTest {
    // TODO - Bättre namn på alla test
    @Test
    void generateDeckTest() {
        Dealer dealer = new Dealer();
        dealer.generateDeck();
        assertEquals(52, dealer.getDeck().size());
    }


    @Test
    void generateSingleSuitTest() {
        Card card = new Card("clubs", 1);
        Dealer dealer = new Dealer();
        dealer.generateSingleSuit("clubs");
        assertEquals(card.getSuit(), dealer.getDeck().getFirst().getSuit());

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
}