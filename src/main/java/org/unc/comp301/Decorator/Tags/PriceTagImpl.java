package org.unc.comp301.Decorator.Tags;


public class PriceTagImpl implements PriceTag {
    private double amount;

    PriceTagImpl(double amount) {
        this.amount = amount;
    }

    @Override
    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public PriceTag unwrap(){
        return this;
    }



}