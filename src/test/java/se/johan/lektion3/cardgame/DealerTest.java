package se.johan.lektion3.cardgame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DealerTest {
    // TODO - Bättre namn på alla test-metoder
    // TODO - Fixa en beforeEach/beforeAll metod som instansierar alla klasser istället för att gör det i varje metod (DRY)


    @Test
    void generateDeckTest() {
        Dealer dealer = new Dealer();
        dealer.generateDeck();
        assertEquals(52, dealer.getDeck().size());
    }


    @Test
    void shuffleTest() {
        Dealer dealerUnsorted = new Dealer();
        dealerUnsorted.generateDeck();

        Dealer dealerSorted = new Dealer();
        dealerSorted.generateDeck();
        dealerSorted.shuffle();

        assertNotEquals(dealerSorted, dealerUnsorted);
    }

    @Test
    void discardTest() {
        Dealer dealerComplete = new Dealer();
        dealerComplete.generateDeck();

        Dealer dealerMissing = new Dealer();
        dealerMissing.generateDeck();
        dealerMissing.discard();


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

    @Test
    void giveCardTest() {
        Player player = new Player();
        Dealer dealer = new Dealer();

        dealer.generateDeck();
        dealer.giveCard(player);
        assertEquals(1, player.getHand().size());
    }

    @Test
    void giveCardAndDiscardTest() {
        Player player = new Player();
        Dealer dealer = new Dealer();

        dealer.generateDeck();
        dealer.giveCard(player);
        assertEquals(51, dealer.getDeck().size());
    }


    @Test
    void calculatePlayerValueTest() {
        Player player = new Player();
        Dealer dealer = new Dealer();
        dealer.generateDeck();
        dealer.giveCard(player);
        dealer.calculatePlayerValue(player);

        assertNotEquals(0, player.getValue());
    }
}