package se.johan.lektion3.cardgame.controller;


import se.johan.lektion3.cardgame.model.Player;

import static se.johan.lektion3.cardgame.view.Printer.*;

public class Rule {

    public static boolean over21(Player player) {
        return (player.getValue() > 21);
    }

    public void strongAce(Player player) {
        if (containsAce(player) && over21(player)) {
            for (int i = 0; i < player.getHand().size(); i++) {
                if (player.getHand().get(i).getValue() == 11) {
                    player.getHand().get(i).setValue(1);
                }
            }
        }
    }

     boolean containsAce(Player player) {
        for (int i = 0; i < player.getHand().size(); i++) {
            if (player.getHand().get(i).getValue() == 11) {
                return true;
            }
        }
        return false;
    }

     boolean winCondition(Player player) {
        return (player.getValue() == 21);
    }


     void checkForWinWhenHit(Player player, Player opponent) {
        if (checkIfOnePlayersOver21(player, opponent)) {
            if (winCondition(player)) {
                printAfterWin("Du vann!", player, opponent);
            } else if (winCondition(opponent)) {
                printAfterWin("Motståndaren vann!", player, opponent);
            } else if (winCondition(player) && winCondition(opponent)) {
                printAfterWin("Lika!", player, opponent);
            }
        } else if (checkIfBothPlayersOver21(player, opponent)) {
            printAfterWin("Lika!", player, opponent);
        } else if (over21(player)) {
            printAfterWin("Motståndaren vann!", player, opponent);
        } else if (over21(opponent)) {
            printAfterWin("Du vann!", player, opponent);
        }
    }


     void checkForWinWhenStand(Player player, Player opponent) {
        if (checkIfOnePlayersOver21(player, opponent)) {
            if (player.getValue() > opponent.getValue()) {
                printAfterWin("Du vann!", player, opponent);
            } else if (player.getValue() < opponent.getValue()) {
                printAfterWin("Motståndaren vann!", player, opponent);
            } else if (player.getValue() == opponent.getValue()) {
                printAfterWin("Lika!", player, opponent);
            }
        } else if (checkIfBothPlayersOver21(player, opponent)) {
            printAfterWin("Lika!", player, opponent);
        } else if (over21(player)) {
            printAfterWin("Motståndaren vann!", player, opponent);
        } else if (over21(opponent)) {
            printAfterWin("Du vann!", player, opponent);
        }
    }

     boolean checkIfOnePlayersOver21(Player player, Player opponent) {
        return !over21(player) && !over21(opponent);
    }

     boolean checkIfBothPlayersOver21(Player player, Player opponent) {
        return over21(player) && over21(opponent);
    }

     void beforeAndAfterRound(Dealer dealer, Player player, Player opponent) {
        dealer.calculatePlayerValue(player);
        strongAce(player);
        dealer.calculatePlayerValue(player);


        dealer.calculatePlayerValue(opponent);
        strongAce(opponent);
        dealer.calculatePlayerValue(opponent);
    }

     void checkIfOpponentShouldDraw(Dealer dealer, Player player, Player opponent){
        while (opponent.getValue() < 17) {
            beforeAndAfterRound(dealer, player, opponent);
            dealer.giveCard(opponent);
            beforeAndAfterRound(dealer, player, opponent);
        }
    }


}
