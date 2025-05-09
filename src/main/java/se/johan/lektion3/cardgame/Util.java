package se.johan.lektion3.cardgame;

import static se.johan.lektion3.cardgame.Game.dealer;
import static se.johan.lektion3.cardgame.Game.rule;


public class Util {

    void dealerCheck(Player player) {
        dealer.calculatePlayerValue(player);
        rule.strongAce(player);
    }

    void dealerStart() {
        dealer.generateDeck();
        dealer.shuffle();
    }

}