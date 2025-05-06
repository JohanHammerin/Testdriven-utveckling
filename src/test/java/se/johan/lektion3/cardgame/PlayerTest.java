package se.johan.lektion3.cardgame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    // TODO - Bättre namn på alla test-metoder
    @Test
    void setName() {
        Player player = new Player("Benny");
        assertEquals("Benny", player.getName());
    }

    @Test
    void setValue() {
        Player player = new Player("Benny");
        player.setValue(-100);
        assertEquals(-1, player.getValue());
    }

}