package se.johan.lektion3.cardgame;


import static se.johan.lektion3.cardgame.Printer.*;

public class Rule {

    static boolean over21(Player player) {
        return (player.getValue() > 21);
    }

    static void strongAce(Player player) {
        if (containsAce(player) && over21(player)) {
            for (int i = 0; i < player.getHand().size(); i++) {
                if (player.getHand().get(i).getValue() == 11) {
                    player.getHand().get(i).setValue(1);
                }
            }
        }
    }

    static boolean containsAce(Player player) {
        for (int i = 0; i < player.getHand().size(); i++) {
            if (player.getHand().get(i).getValue() == 11) {
                return true;
            }
        }
        return false;
    }

    static boolean winCondition(Player player) {
        return (player.getValue() == 21);
    }


    static void checkForWinWhenHit(Player player, Player opponent) {
        if (checkIfOnePlayersOver21(player, opponent)) {
            if (winCondition(player)) {
                printAfterWin("Du vann!", player, opponent);
            } else if (winCondition(opponent)) {
                printAfterWin("1Motståndaren vann!", player, opponent);
            } else if (winCondition(player) && winCondition(opponent)) {
                printAfterWin("Lika!", player, opponent);
            }
        } else if (checkIfBothPlayersOver21(player, opponent)) {
            printAfterWin("Lika!", player, opponent);
        } else if (over21(player)) {
            printAfterWin("2Motståndaren vann!", player, opponent);
        } else if (over21(opponent)) {
            printAfterWin("Du vann!", player, opponent);
        }
    }


    static void checkForWinWhenStand(Player player, Player opponent) {
        if (checkIfOnePlayersOver21(player, opponent)) {
            if (player.getValue() > opponent.getValue()) {
                printAfterWin("Du vann!", player, opponent);
            } else if (player.getValue() < opponent.getValue()) {
                printAfterWin("3Motståndaren vann!", player, opponent);
            } else if (player.getValue() == opponent.getValue()) {
                printAfterWin("Lika!", player, opponent);
            }
        } else if (checkIfBothPlayersOver21(player, opponent)) {
            printAfterWin("Lika!", player, opponent);
        } else if (over21(player)) {
            printAfterWin("4Motståndaren vann!", player, opponent);
        } else if (over21(opponent)) {
            printAfterWin("Du vann!", player, opponent);
        }
    }

    static boolean checkIfOnePlayersOver21(Player player, Player opponent) {
        return !over21(player) && !over21(opponent);
    }

    static boolean checkIfBothPlayersOver21(Player player, Player opponent) {
        return over21(player) && over21(opponent);
    }

    static void beforeAndAfterRound(Dealer dealer, Player player, Player opponent) {
        dealer.calculatePlayerValue(player);
        strongAce(player);
        dealer.calculatePlayerValue(player);


        dealer.calculatePlayerValue(opponent);
        strongAce(opponent);
        dealer.calculatePlayerValue(opponent);
    }


}
