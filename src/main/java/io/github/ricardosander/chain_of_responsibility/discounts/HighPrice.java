package io.github.ricardosander.chain_of_responsibility.discounts;

import io.github.ricardosander.chain_of_responsibility.Budget;
import io.github.ricardosander.chain_of_responsibility.Discount;

public class HighPrice implements Discount {

    private Discount next;

    @Override
    public double apply(Budget budget) {
        if (budget.getValue() > 500) {
            return budget.getValue() * 0.07;
        }
        return next.apply(budget);
    }

    @Override
    public void setNext(Discount next) {
        this.next = next;
    }
}
