package org.unc.comp301.Decorator.Tags;

public class DiscountedPriceTag implements PriceTag {
    private PriceTag tag;
    private double discount;

    public DiscountedPriceTag(PriceTag tag, double discount) {
        this.tag = tag;
        this.discount = discount;
    }

    public void setAmount(double amount) {
        tag.setAmount(amount);
    }

    public double getAmount() {
        return Math.max(tag.getAmount() - discount, 0);
    }
}