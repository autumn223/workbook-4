package com.mgm.blackjack.models;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for number of players
        System.out.print("Enter number of players: ");
        int numPlayers = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Create players with hands
        Player[] players = new Player[numPlayers];
        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Enter the name of the player " + (i + 1) + ": ");
            String playerName = scanner.nextLine();
            players[i] = new Player(playerName, new Hand()); // Pass a new Hand object here
        }

        // Create deck and shuffle
        Deck deck = new Deck();
        deck.shuffle();

        // Deal 2 cards to each player
        for (int i = 0; i < numPlayers; i++) {
            players[i].addCardToHand(deck.deal());
            players[i].addCardToHand(deck.deal());
        }

        // Show each player's hand and value
        for (Player player : players) {
            player.displayHand();
        }

        // Find winner
        Player winner = null;
        int highestScore = 0;
        for (Player player : players) {
            int playerScore = player.getHandValue();
            if (playerScore <= 21 && playerScore > highestScore) {
                highestScore = playerScore;
                winner = player;
            }
        }

        if (winner != null) {
            System.out.println("The winner is: " + winner.getName() + " with a score of " + highestScore);
        } else {
            System.out.println("No winner!");
        }

        scanner.close();
    }
}