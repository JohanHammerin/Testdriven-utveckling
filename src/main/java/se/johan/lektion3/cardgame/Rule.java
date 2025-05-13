package se.johan.lektion3.cardgame;

import javax.swing.plaf.OptionPaneUI;

public class Rule {

    public boolean over21(Player player) {
        return (player.getValue() > 21);
    }

    public void strongAce(Player player) {
        if (containsAce(player) && player.getValue() > 21) {
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


    void checkForWin(Player player, Player opponent) {
        if (!over21(player) || !over21(opponent)) {
            if (winCondition(player)) {
                System.out.println("Du vann");
                System.exit(0);
            } else if (winCondition(opponent)) {
                System.out.println("Motståndaren vann");
                System.exit(0);
            } else if (winCondition(player) && winCondition(opponent)) {
                System.out.println("Lika");
                System.exit(0);
            }

        }
    }


}
