package se.johan.lektion3.cardgame;

import java.util.Scanner;

import static se.johan.lektion3.cardgame.Rule.*;

public class Game {
    Dealer dealer = new Dealer();
    Player player = new Player("Benny");
    Player opponent = new Player("Bananas");


    void printHandsUnderRound() {
        for (int i = 0; i < player.getHand().size(); i++) {
            System.out.print(player.getHand().get(i).getSuit() + " ");
            System.out.print(player.getHand().get(i).getValue() + ", ");
        }

        System.out.println();
        for (int i = 0; i < opponent.getHand().size() - 1; i++) {
            System.out.print(opponent.getHand().get(i).getSuit() + " ");
            System.out.print(opponent.getHand().get(i).getValue() + ", ");
        }
        System.out.print("?");
        System.out.println();

    }


    // TODO - Cool grej att fixa
    void start() {
        dealer.generateDeck();
        dealer.shuffle();
        firstRound();
        for (int i = 0; i < 10; i++) {
            round();
            String line = "-";
            System.out.println(line.repeat(100));
            beforeAndAfterRound();
        }
    }


    void round() {
        printHandsUnderRound();
        if (opponent.getValue() < 17) {
            dealer.giveCard(opponent);
        }
        Scanner input = new Scanner(System.in);

        System.out.println("Tryck 1 för att dra ett nytt kort. Tryck 2 för att stå rundan");
        int choice = input.nextInt();
        if (choice == 1) {
            dealer.giveCard(player);
            beforeAndAfterRound();
            checkForWinWhenHit(player, opponent);
        } else if (choice == 2) {
            System.out.println("Du stod över rundan");
            beforeAndAfterRound();
            checkForWinWhenStand(player, opponent);
        } else {
            System.out.println("Ogiltig input");
        }
    }

    void firstRound() {
        dealer.giveCard(player);
        dealer.giveCard(player);


        dealer.giveCard(opponent);
        dealer.giveCard(opponent);

        beforeAndAfterRound();

        checkForWinWhenHit(player, opponent);
    }


    void beforeAndAfterRound() {
        strongAce(player);
        dealer.calculatePlayerValue(player);

        strongAce(opponent);
        dealer.calculatePlayerValue(opponent);
    }

}
