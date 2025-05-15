package se.johan.lektion3.cardgame;

import org.junit.jupiter.api.Test;
import se.johan.lektion3.cardgame.model.Card;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    // TODO - Bättre namn på alla test-metoder

    @Test
    void setSuitTest() {
        Card card = new Card("clubs",4);
        card.setSuit("");
        assertEquals("Suit can't be empty", card.getSuit());
    }

    @Test
    void setValueTest() {
        Card card = new Card("clubs", 4);
        card.setValue(0);
        assertEquals(-1, card.getValue());
    }
}