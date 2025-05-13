package se.johan.lektion3.cardgame;

import java.util.Scanner;

public class Game {
    Dealer dealer = new Dealer();
    Rule rule = new Rule();
    Player player = new Player("Benny");
    Player opponent = new Player("Bananas");


    // TODO - Cool grej att fixa
    void start() {
        dealer.generateDeck();
        dealer.shuffle();
        firstRound();
        for (int i = 0; i < 3; i++) {
            round();
            String line = "-";
            System.out.println(line.repeat(100));
        }
    }


    void printCurrentHandPlayer() {
        System.out.print("You: ");
        for (int i = 0; i < player.getHand().size(); i++) {
            System.out.print(player.getHand().get(i).getSuit() + " ");
            System.out.print(player.getHand().get(i).getValue() + ", ");
        }
        System.out.println();
    }

    void printCurrentHandOpponentTrue() {
        System.out.print("Opponent: ");
        for (int i = 0; i < opponent.getHand().size(); i++) {
            System.out.print(opponent.getHand().get(i).getSuit() + " ");
            System.out.print(opponent.getHand().get(i).getValue() + ", ");
        }
        System.out.println();
    }

    void printCurrentHandOpponent() {
        System.out.print("Opponent: ");

        for (int i = 0; i < opponent.getHand().size() - 1; i++) {
            System.out.print(opponent.getHand().get(i).getSuit() + " ");
            System.out.print(opponent.getHand().get(i).getValue() + ", ");
        }
        System.out.print("?");
        System.out.println();

    }


    void round() {
        beforeAndAfterRound();

        printCurrentHandPlayer();
        printCurrentHandOpponent();
        if (opponent.getValue() < 17) {
            dealer.giveCard(opponent);
        }
        Scanner input = new Scanner(System.in);

        System.out.println("Tryck 1 för att dra ett nytt kort. Tryck 2 för att stå rundan");
        int choice = input.nextInt();
        if (choice == 1) {
            dealer.giveCard(player);
            beforeAndAfterRound();
            checkForWin();

            printCurrentHandPlayer();
        } else if (choice == 2) {
            System.out.println("Du stod över rundan");
            beforeAndAfterRound();
            printCurrentHandOpponentTrue();
            checkForWin();
            checkForWinWhenStand();
        } else {
            System.out.println("Ogiltig input");
        }

        beforeAndAfterRound();


    }

    void firstRound() {
        dealer.giveCard(player);
        dealer.giveCard(player);


        dealer.giveCard(opponent);
        dealer.giveCard(opponent);

        beforeAndAfterRound();

        checkForWin();
    }



    public void getValues() {
        System.out.println(player.getValue());
        System.out.println(opponent.getValue());
    }



    void beforeAndAfterRound() {
        rule.strongAce(player);
        dealer.calculatePlayerValue(player);

        rule.strongAce(opponent);
        dealer.calculatePlayerValue(opponent);
    }

}
