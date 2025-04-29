package se.johan.lektion3.cardgame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DealerTest {

    @Test
    void generateDeckTest() {

    }

    // TODO - Bättre namn på alla test
    @Test
    void generateSingleSuitTest() {
        Card card = new Card("clubs", 1);
        Dealer dealer = new Dealer();
        dealer.generateSingleSuit("clubs");
        assertEquals(card.getSuit(), dealer.getDeck().getFirst().getSuit());

    }
}