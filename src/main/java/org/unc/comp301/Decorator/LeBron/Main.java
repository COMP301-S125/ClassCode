package org.unc.comp301.Decorator.LeBron;

public class Main {
    public static void main(String[] args){
        King leBron = new LeBron();
        leBron = new Hairline(leBron);
        leBron = new CranberrySprite(leBron);
        leBron = new UNCJersey(leBron);
        leBron = new Bronny(leBron);


        System.out.println(leBron.getDescrition());

    }
}
