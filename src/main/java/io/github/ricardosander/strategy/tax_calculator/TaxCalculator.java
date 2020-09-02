package io.github.ricardosander.strategy.tax_calculator;

public class TaxCalculator {

    public double computes(Tax tax, Budget budget) {
        return tax.computes(budget);
    }

}
