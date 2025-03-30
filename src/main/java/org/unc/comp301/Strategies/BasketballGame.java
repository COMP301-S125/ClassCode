package org.unc.comp301.Strategies;

public class BasketballGame {
  public static void main(String[] args) {
    // Create teams with initial strategies
    Team oleMiss = new Team("Rebels", new DefensiveStrategy());
    Team michigan = new Team("Spartans", new OffensiveStrategy());

    // First Half - Initial Strategies
    System.out.println("🏀 First Half:");
    oleMiss.play();
    michigan.play();

    // Halftime Adjustment
    System.out.println("\n⏸️ Halftime: Coaches adjust strategies...");
    oleMiss.setStrategy(new FallApartStrategy());

    // Second Half - New Strategies
    System.out.println("\n🏀 Second Half:");
    oleMiss.play();
    michigan.play();
  }
}
