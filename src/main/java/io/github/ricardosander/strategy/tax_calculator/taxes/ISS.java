package io.github.ricardosander.strategy.tax_calculator.taxes;

import io.github.ricardosander.strategy.tax_calculator.Budget;
import io.github.ricardosander.strategy.tax_calculator.Tax;

/**
 * ISS is a brazilian tax.
 * ISS comes from Imposto Sobre Serviços
 */
public class ISS implements Tax {

    @Override
    public double computes(Budget budget) {
        return budget.getValue() * 0.06;
    }
}
