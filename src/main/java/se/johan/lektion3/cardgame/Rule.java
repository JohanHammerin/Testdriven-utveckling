package se.johan.lektion3.cardgame;

public class Rule {

    public boolean over21(Player player) {
        return (player.getValue() > 21);
    }


}
