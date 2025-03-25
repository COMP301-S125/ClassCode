package org.unc.comp301.Decorator.LeBron;

public class LeBron implements King {
    String description;

    public LeBron(){
        description = "A Beautiful 250 pound 6 foot 9 KING ";
    }

    @Override
    public String getDescrition() {
        return description;
    }
}
