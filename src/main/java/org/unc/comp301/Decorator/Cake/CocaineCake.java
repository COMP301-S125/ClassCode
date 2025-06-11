package org.unc.comp301.Decorator.Cake;

public class CocaineCake implements Cake {
    Cake cake;

    public CocaineCake(Cake cake){
        this.cake = cake;
    }



    public String getDescription() {
        return cake.getDescription() +" laced with a suspicious white substance that will make you roar";
    }
}
