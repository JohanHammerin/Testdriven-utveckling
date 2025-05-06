package se.johan.lektion3.cardgame;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RuleTest {

    @Test
    void over21Test() {
        Rule rule = new Rule();
        Player player = new Player("Benny", 21);

        assertEquals(21, player.getValue());
    }

    @Test
    void containsAceTest() {
        Card ace = new Card("diamonds",1);
        List<Card> hand = new ArrayList<>();
        hand.add(ace);
        Rule rule = new Rule();
        Player player = new Player("Benny",hand);

        assertEquals(ace, player.getHand().getFirst());
    }
}