package org.unc.comp301.Strategies;

public class FallApartStrategy implements PlayStrategy {
    @Override
    public void execute() {
        System.out.println("Drop the ball and let it roll away....");
    }
}
