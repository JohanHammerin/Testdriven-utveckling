package se.johan.lektion3.cardgame;


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
        if (!checkBothPlayersOver21(player, opponent)) {
            if (winCondition(player)) {
                System.out.println("Du vann");
                printHandsAfterWin(player, opponent);
                getValues(player, opponent);
                System.exit(0);
            } else if (winCondition(opponent)) {
                System.out.println("Motståndaren vann");
                printHandsAfterWin(player, opponent);

                getValues(player, opponent);
                System.exit(0);
            } else if (winCondition(player) && winCondition(opponent)) {
                System.out.println("Lika");
                printHandsAfterWin(player, opponent);
                getValues(player, opponent);
                System.exit(0);
            }
        } else if (over21(player)) {
            System.out.println("Motståndaren vann");
            printHandsAfterWin(player, opponent);
            getValues(player, opponent);
            System.exit(0);

        } else if (over21(opponent)) {
            System.out.println("Du vann");
            printHandsAfterWin(player, opponent);
            getValues(player, opponent);
            System.exit(0);
        } else if (checkBothPlayersOver21(player, opponent)) {
            System.out.println("Lika");
            printHandsAfterWin(player, opponent);
            getValues(player, opponent);
            System.exit(0);
        }
    }


    static void checkForWinWhenStand(Player player, Player opponent) {
        if (!checkBothPlayersOver21(player, opponent)) {
            if (player.getValue() > opponent.getValue()) {
                System.out.println("Du vann");
                printHandsAfterWin(player, opponent);
                getValues(player, opponent);
                System.exit(0);
            } else if (player.getValue() < opponent.getValue()) {
                System.out.println("Motståndaren vann");
                printHandsAfterWin(player, opponent);
                getValues(player, opponent);
                System.exit(0);
            } else if (player.getValue() == opponent.getValue()) {
                System.out.println("Lika");
                printHandsAfterWin(player, opponent);
                getValues(player, opponent);
                System.exit(0);
            }
        } else if (over21(player)) {
            System.out.println("Motståndaren vann");
            printHandsAfterWin(player, opponent);
            getValues(player, opponent);
            System.exit(0);

        } else if (over21(opponent)) {
            System.out.println("Du vann");
            printHandsAfterWin(player, opponent);
            getValues(player, opponent);
            System.exit(0);
        } else if (checkBothPlayersOver21(player, opponent)) {
            System.out.println("Lika");
            printHandsAfterWin(player, opponent);
            getValues(player, opponent);
            System.exit(0);
        }
    }

    static boolean checkBothPlayersOver21(Player player, Player opponent) {
        return over21(player) || over21(opponent);
    }

    static void getValues(Player player, Player opponent) {
        System.out.println(player.getValue());
        System.out.println(opponent.getValue());
    }

    static void printHandsAfterWin(Player player, Player opponent) {
        for (int i = 0; i < player.getHand().size(); i++) {
            System.out.print(player.getHand().get(i).getSuit() + " ");
            System.out.print(player.getHand().get(i).getValue() + ", ");
        }

        System.out.println();
        for (int i = 0; i < opponent.getHand().size(); i++) {
            System.out.print(opponent.getHand().get(i).getSuit() + " ");
            System.out.print(opponent.getHand().get(i).getValue() + ", ");
        }
        System.out.println();
    }

}
