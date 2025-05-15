package se.johan.lektion3.cardgame.view;

import se.johan.lektion3.cardgame.model.Player;

public class Printer {

    static void printHandsAfterWin(Player player) {
        for (int i = 0; i < player.getHand().size(); i++) {
            System.out.print(player.getHand().get(i).getSuit() + " ");
            System.out.print(player.getHand().get(i).getValue() + ", ");
        }
        System.out.println();
    }

    static void getValues(Player player, Player opponent) {
        System.out.println(player.getValue());
        System.out.println(opponent.getValue());
    }

    public static void printAfterWin(String message, Player player, Player opponent) {
        System.out.println(message);
        printHandsAfterWin(player);
        printHandsAfterWin(opponent);
        getValues(player, opponent);
        System.exit(0);
    }

    public static void printHandsUnderRound(Player player, Player opponent) {
        Printer.printHandsAfterWin(player);

        for (int i = 0; i < opponent.getHand().size() - 1; i++) {
            System.out.print(opponent.getHand().get(i).getSuit() + " ");
            System.out.print(opponent.getHand().get(i).getValue() + ", ");
        }
        System.out.print("?");
        System.out.println();

    }
}
