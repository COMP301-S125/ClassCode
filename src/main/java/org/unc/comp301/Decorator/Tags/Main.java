package org.unc.comp301.Decorator.Tags;

public class Main {
    public static void main(String[] args){
        PriceTag msrp = new PriceTagImpl(100);

        PriceTag clearance = new DiscountedPriceTag(msrp, 20);
        PriceTag finalSale = new TaxedPriceTagImpl(clearance, 0.07);


        System.out.println(msrp.getAmount());
        System.out.println(clearance.getAmount());
        System.out.println(finalSale.getAmount());

        System.out.println(finalSale.unwrap().getAmount());
    }
}
