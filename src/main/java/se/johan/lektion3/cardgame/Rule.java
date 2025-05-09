package se.johan.lektion3.cardgame;

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


}
