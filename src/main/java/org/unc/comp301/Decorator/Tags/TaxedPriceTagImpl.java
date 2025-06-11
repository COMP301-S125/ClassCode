package org.unc.comp301.Decorator.Tags;

public class TaxedPriceTagImpl implements PriceTag{
    private final PriceTag tag;
    private final double taxRate;

    public TaxedPriceTagImpl(PriceTag tag, double taxRate){
        this.tag = tag;
        this.taxRate = taxRate;
    }

    @Override
    public void setAmount(double amount) {
        tag.setAmount(amount);
    }

    @Override
    public double getAmount() {
        return tag.getAmount()+ tag.getAmount()*taxRate;
    }

    @Override
    public PriceTag unwrap() {
        return tag.unwrap();
    }
}