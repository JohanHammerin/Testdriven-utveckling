package se.johan.lektion3.cardgame;

import org.junit.jupiter.api.Test;
import se.johan.lektion3.cardgame.controller.Game;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {


    @Test
    void firstRoundTest() {
        Game game = new Game();
        game.dealer.generateDeck();
        game.firstRound();


        assertEquals(2, game.player.getHand().size());
    }
}