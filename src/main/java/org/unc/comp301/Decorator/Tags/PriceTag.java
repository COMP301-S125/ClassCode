package org.unc.comp301.Decorator.Tags;

public interface PriceTag {
    void setAmount(double amount);

    double getAmount();

    PriceTag unwrap();
}