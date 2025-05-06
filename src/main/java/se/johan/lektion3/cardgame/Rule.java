package se.johan.lektion3.cardgame;

public class Rule {

    public boolean over21(Player player) {
        return (player.getValue() > 21);
    }

    /*
    public boolean strongAce(Player player) {
        if (player.getHand())
            if (over21(player)) {

            }
    }
     */

    public boolean containsAce(Player player) {
        for (int i = 0; i < player.getHand().size(); i++) {
            if (player.getHand().get(i).getValue() == 1) {
                return true;
            }
        }
        return false;
    }


}
