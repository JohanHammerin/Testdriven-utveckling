package se.johan.lektion3.cardgame;

public class Game {
    static Dealer dealer;
    static Rule rule;
    static Player player;

    public Game(String name) {
        dealer = new Dealer();
        rule = new Rule();
        player = new Player("Benny");
    }

    void start() {
        dealer.generateDeck();
        dealer.shuffle();
        System.out.println();
    }

    void round() {

    }

    void beforeAndAfterRound() {

    }

}
