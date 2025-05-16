package se.johan.lektion3.cardgame.controller;

import se.johan.lektion3.cardgame.model.Player;

import java.util.Objects;
import java.util.Scanner;

import static se.johan.lektion3.cardgame.view.Printer.printHandsUnderRound;


public class Game {
    public Dealer dealer = new Dealer();
    public Player player = new Player();
    Rule rule = new Rule();
    Player opponent = new Player();


    public void start() {
        dealer.generateDeck();
        dealer.shuffle();
        firstRound();
        for (int i = 0; i < 20; i++) {
            round();
            String line = "-";
            System.out.println(line.repeat(100));
            rule.beforeAndAfterRound(dealer, player, opponent);
        }
    }


    void round() {
        Scanner input = new Scanner(System.in);

        printHandsUnderRound(player, opponent);

        System.out.println("Tryck 1 för att dra ett nytt kort. Tryck 2 för att stå rundan");
        String choice = input.next();
        if (Objects.equals(choice, "1")) {
            dealer.giveCard(player);
            rule.beforeAndAfterRound(dealer, player, opponent);
            if(player.getValue() == 21){
                rule.checkIfOpponentShouldDraw(dealer, player, opponent);
            }
            rule.checkForWinWhenHit(player, opponent);

        } else if (Objects.equals(choice, "2")) {
            System.out.println("Du stod över rundan");
            rule.checkIfOpponentShouldDraw(dealer, player, opponent);

            rule.beforeAndAfterRound(dealer, player, opponent);
            rule.checkForWinWhenStand(player, opponent);
        } else {
            System.out.println("Ogiltig input");
        }
    }


    public void firstRound() {
        dealer.giveCard(player);
        dealer.giveCard(player);


        dealer.giveCard(opponent);
        dealer.giveCard(opponent);

        rule.beforeAndAfterRound(dealer, player, opponent);

        rule.checkForWinWhenHit(player, opponent);
    }


}
