package io.github.ricardosander.strategy.tax_calculator.taxes;

import io.github.ricardosander.strategy.tax_calculator.Budget;
import io.github.ricardosander.strategy.tax_calculator.Tax;

/**
 * ICMS is a brazilian tax.
 * ICMS comes from Imposto sobre Circulação de Mercadorias e Serviços.
 */
public class ICMS implements Tax {

    @Override
    public double computes(Budget budget) {
        return (budget.getValue() * 0.05) + 50;
    }
}
