package se.johan.lektion3.cardgame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {


    @Test
    void setValueTest() {
        Player player = new Player();
        player.setValue(-100);
        assertEquals(-1, player.getValue());
    }

}