package org.unc.comp301.Decorator.Cake;

public class RainbowCake implements Cake{
    Cake cake;

    public RainbowCake(Cake cake){
        this.cake = cake;
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + " with delicious rainbow dash sprinkles";
    }
}
