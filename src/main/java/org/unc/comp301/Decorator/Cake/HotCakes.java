package org.unc.comp301.Decorator.Cake;

public class HotCakes implements Cake{
    Cake cake;

    public HotCakes(Cake cake){
        this.cake = cake;
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + " with a layer of pure heat";
    }
}
