package org.unc.comp301.Strategies;

public class DefensiveStrategy implements PlayStrategy{
    @Override
    public void execute() {
        System.out.println("Protecting their side of the court at all costs");
    }
}
