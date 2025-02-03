package org.unc.comp301.RockPaperScissors;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("WELCOME TO THE RPS WORLD CHAMPIONSHIPS!");
      System.out.println("PLAYER 1, pick your weapon:");

      String answer = scanner.nextLine();
      AHand player1 = getHand(answer);
      System.out.println("PLAYER 2, pick your weapon:");
      answer = scanner.nextLine();
      AHand player2 = getHand(answer);

      if (player1.equals(player2)) {
        System.out.println("IT's a draw!!");
      } else if (player1.beats(player2)) {
        System.out.println("PLAYER1 BRUTALLY TAKES DOWN PLAYER 2!");
      } else {
        System.out.println("PLAYER 2 BRUTALLY TAKES DOWN PLAYER 1!");
      }
    }
  }

  private static AHand getHand(String answer) {
    AHand player;
    switch (answer.toUpperCase()) {
      case "ROCK" -> player = new Rock();
      case "PAPER" -> player = new Paper();
      case "SCISSORS" -> player = new Scissors();
      default -> player = new Rock();
    }

    System.out.println(player);
    return player;
  }
}
