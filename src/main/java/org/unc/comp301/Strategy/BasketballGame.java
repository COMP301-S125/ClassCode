package org.unc.comp301.Strategy;

import org.unc.comp301.Strategy.Strategies.FallApart;
import org.unc.comp301.Strategy.Strategies.FastBreakOffense;
import org.unc.comp301.Strategy.Strategies.ThreePointAttack;
import org.unc.comp301.Strategy.Strategies.ZoneDefense;

public class BasketballGame {
  public static void main(String[] args) {
    // Create teams with initial strategies
    Team oleMiss = new Team("Rebels", new FastBreakOffense());
    Team michigan = new Team("Spartans", new ZoneDefense());

    // First Half - Initial Strategies
    System.out.println("🏀 First Half:");
    oleMiss.play();
    michigan.play();

    // Halftime Adjustment
    System.out.println("\n⏸️ Halftime: Coaches adjust strategies...");

    oleMiss.setStrategy(new ThreePointAttack()); // Eagles shift to shooting threes
    michigan.setStrategy(new FallApart()); // Wolves switch to offense

    // Second Half - New Strategies
    System.out.println("\n🏀 Second Half:");
    oleMiss.play();
    michigan.play();
  }
}
