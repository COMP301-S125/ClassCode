package org.unc.comp301.Strategies;

public class OffensiveStrategy implements PlayStrategy{
    @Override
    public void execute() {
        System.out.println("Try to make as many baskets as possible");
    }
}
