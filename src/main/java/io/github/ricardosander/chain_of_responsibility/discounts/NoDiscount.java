package io.github.ricardosander.chain_of_responsibility.discounts;

import io.github.ricardosander.chain_of_responsibility.Budget;
import io.github.ricardosander.chain_of_responsibility.Discount;

public class NoDiscount implements Discount {

    @Override
    public double apply(Budget budget) {
        return 0;
    }

    @Override
    public void setNext(Discount next) {

    }
}
