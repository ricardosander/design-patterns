package io.github.ricardosander.chain_of_responsibility.discount_calculator.discounts;

import io.github.ricardosander.chain_of_responsibility.discount_calculator.Budget;
import io.github.ricardosander.chain_of_responsibility.discount_calculator.Discount;

public class NoDiscount implements Discount {

    @Override
    public double apply(Budget budget) {
        return 0;
    }

    @Override
    public void setNext(Discount next) {

    }
}
