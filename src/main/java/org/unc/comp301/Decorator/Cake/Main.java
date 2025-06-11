package org.unc.comp301.Decorator.Cake;

public class Main {
    public static void main(String[] args){
        Cake myCake = new ChocolateCake();
        myCake = new RainbowCake(myCake);
        myCake = new CocaineCake(myCake);
        myCake = new HotCakes(myCake);
        myCake = new MyCake(myCake);

        System.out.println(myCake.getDescription());
    }
}
