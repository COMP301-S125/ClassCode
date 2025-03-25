package org.unc.comp301.Decorator.LeBron;

public class Hairline implements King{
    King king;

    public Hairline(King king){
        this.king = king;
    }

    @Override
    public String getDescrition() {
        return king.getDescrition() +"with a luscious LeHairline ";
    }
}
