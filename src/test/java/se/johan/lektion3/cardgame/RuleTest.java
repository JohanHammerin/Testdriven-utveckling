package se.johan.lektion3.cardgame;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RuleTest {

    @Test
    void over21Test() {
        Player player = new Player("Benny", 25);
        Rule rule = new Rule();
        assertEquals(true, rule.over21(player));
    }

    @Test
    void containsAceTest() {
        Card ace = new Card("diamonds", 1);
        List<Card> hand = new ArrayList<>();
        hand.add(ace);
        Player player = new Player("Benny", hand);
        assertEquals(ace, player.getHand().getFirst());
    }

    @Test
    void strongAce() {
        List<Card> testList = new ArrayList<>();
        Card cardOne = new Card("clubs", 5);
        Card cardTwo = new Card("clubs", 10);
        Card cardThree = new Card("clubs", 11);
        testList.add(cardOne);
        testList.add(cardTwo);
        testList.add(cardThree);


        Player player = new Player("Benny", testList);

        Dealer dealer = new Dealer();
        dealer.calculatePlayerValue(player);

        Rule rule = new Rule();
        rule.strongAce(player);
        dealer.calculatePlayerValue(player);
        assertEquals(16, player.getValue());

    }
}