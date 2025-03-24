package org.unc.comp301.Decorator.Tags;

public class Main {
    public static void main(String[] args){
        PriceTag msrp = new PriceTagImpl(100);
        DiscountedPriceTag saleTag = new DiscountedPriceTag(msrp, 20);

        System.out.println(saleTag.getAmount());

    }
}
