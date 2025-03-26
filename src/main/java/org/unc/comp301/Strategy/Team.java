package org.unc.comp301.Strategy;

import org.unc.comp301.Strategy.Strategies.PlayStrategy;

public class Team  {
    private String name;
    private PlayStrategy strategy;

    public Team(String name, PlayStrategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public void setStrategy(PlayStrategy strategy) {
        System.out.println(name + " is changing strategy...");
        this.strategy = strategy;
    }

    public void play() {
        System.out.print(name + " is executing strategy: ");
        strategy.execute();
    }
}