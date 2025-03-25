package org.unc.comp301.Decorator.LeBron;

public class Bronny implements King{
    King king;

    Bronny(King king){
        this.king = king;
    }

    @Override
    public String getDescrition() {
        return king.getDescrition() + " standing next to the prince and heir to the fortune if not the throne ";
    }
}
