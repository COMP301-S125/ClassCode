package org.unc.comp301.Decorator.LeBron;

public class UNCJersey implements King{
    King king;

    UNCJersey(King king){
        this.king = king;
    }

    @Override
    public String getDescrition() {
        return king.getDescrition() + " wearing an incredibly attractive #23 UNC jersey";
    }
}
