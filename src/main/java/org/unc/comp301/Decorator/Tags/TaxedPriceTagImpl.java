package org.unc.comp301.Decorator.Tags;

public class TaxedPriceTagImpl implements PriceTag {
    double rate;
    PriceTag pre_tax_tag;

    public TaxedPriceTagImpl(PriceTag pre_tax_tag, double rate) {
        this.pre_tax_tag = pre_tax_tag;
        this.rate = rate;
    }

    @Override
    public void setAmount(double amount) {
        pre_tax_tag.setAmount(amount);
    }

    @Override
    public double getAmount() {
        return pre_tax_tag.getAmount()+getTax();
    }

    @Override
    public PriceTag unwrap() {
        return pre_tax_tag.unwrap();
    }

    public double getTax() {
        return rate*pre_tax_tag.getAmount();
    }

    public double getTaxRate() {
        return rate;
    }

}