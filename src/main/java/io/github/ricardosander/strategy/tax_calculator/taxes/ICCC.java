package io.github.ricardosander.strategy.tax_calculator.taxes;

import io.github.ricardosander.strategy.tax_calculator.Budget;
import io.github.ricardosander.strategy.tax_calculator.Tax;

/**
 * ICCC is a fake tax based on brazilian tax.
 */
public class ICCC implements Tax {

    @Override
    public double computes(Budget budget) {

        if (budget.getValue() < 1000) {
            return budget.getValue() * 0.05;
        }

        if (budget.getValue() <= 3000) {
            return budget.getValue() * 0.07;
        }

        return (budget.getValue() * 0.08) + 30;
    }
}
