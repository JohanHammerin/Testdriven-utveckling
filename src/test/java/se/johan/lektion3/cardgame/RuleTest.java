package se.johan.lektion3.cardgame;

import org.junit.jupiter.api.Test;
import se.johan.lektion3.cardgame.controller.Dealer;
import se.johan.lektion3.cardgame.controller.Rule;
import se.johan.lektion3.cardgame.model.Card;
import se.johan.lektion3.cardgame.model.Player;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RuleTest {

    @Test
    void over21Test() {
        Player player = new Player(25);
        assertTrue(Rule.over21(player));
    }

    @Test
    void containsAceTest() {
        Card ace = new Card("diamonds", 1);
        List<Card> hand = new ArrayList<>();
        hand.add(ace);
        Player player = new Player(hand);
        assertEquals(ace, player.getHand().getFirst());
    }

    @Test
    void strongAceTest() {
        List<Card> testList = new ArrayList<>();
        Card cardOne = new Card("clubs", 5);
        Card cardTwo = new Card("clubs", 10);
        Card cardThree = new Card("clubs", 11);
        testList.add(cardOne);
        testList.add(cardTwo);
        testList.add(cardThree);


        Player player = new Player(testList);

        Dealer dealer = new Dealer();
        dealer.calculatePlayerValue(player);

        Rule.strongAce(player);
        dealer.calculatePlayerValue(player);

        assertEquals(16, player.getValue());

    }

}