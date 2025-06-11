package org.unc.comp301.Decorator.Cake;

public class MyCake implements Cake{
    Cake cake;

    public MyCake(Cake cake){
        this.cake = cake;
    }

    @Override
    public String getDescription() {
        return cake.getDescription() +" that belongs to ME.";
    }
}
