package org.unc.comp301.Decorator.LeBron;

public class CranberrySprite implements King{
    King king;

    public CranberrySprite(King king){
        this.king = king;
    }

    @Override
    public String getDescrition() {
        return king.getDescrition() + "with a only somewhat delicious cranberry sprite on a fireplace ";
    }
}
