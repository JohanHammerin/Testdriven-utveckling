package se.johan.lektion3.cardgame.controller;

import se.johan.lektion3.cardgame.model.Player;

import java.util.Objects;
import java.util.Scanner;

import static se.johan.lektion3.cardgame.view.Printer.printHandsUnderRound;
import static se.johan.lektion3.cardgame.controller.Rule.*;


public class Game {
    public Dealer dealer = new Dealer();
    public Player player = new Player();
    Player opponent = new Player();


    public void start() {
        dealer.generateDeck();
        dealer.shuffle();
        firstRound();
        for (int i = 0; i < 20; i++) {
            round();
            String line = "-";
            System.out.println(line.repeat(100));
            beforeAndAfterRound(dealer, player, opponent);
        }
    }


    void round() {
        Scanner input = new Scanner(System.in);

        printHandsUnderRound(player, opponent);

        System.out.println("Tryck 1 för att dra ett nytt kort. Tryck 2 för att stå rundan");
        String choice = input.next();
        if (Objects.equals(choice, "1")) {
            dealer.giveCard(player);
            beforeAndAfterRound(dealer, player, opponent);
            if(player.getValue() == 21){
                checkIfOpponentShouldDraw(dealer, player, opponent);
            }
            checkForWinWhenHit(player, opponent);

        } else if (Objects.equals(choice, "2")) {
            System.out.println("Du stod över rundan");
            checkIfOpponentShouldDraw(dealer, player, opponent);

            beforeAndAfterRound(dealer, player, opponent);
            checkForWinWhenStand(player, opponent);
        } else {
            System.out.println("Ogiltig input");
        }
    }


    public void firstRound() {
        dealer.giveCard(player);
        dealer.giveCard(player);


        dealer.giveCard(opponent);
        dealer.giveCard(opponent);

        beforeAndAfterRound(dealer, player, opponent);

        checkForWinWhenHit(player, opponent);
    }


}
