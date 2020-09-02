package io.github.ricardosander.chain_of_responsibility.discounts;

import io.github.ricardosander.chain_of_responsibility.Budget;
import io.github.ricardosander.chain_of_responsibility.Discount;

public class MultipleItems implements Discount {

    private Discount next;

    @Override
    public double apply(Budget budget) {
        if (budget.getItems().size() > 5) {
            return budget.getValue() * 0.1;
        }
        return next.apply(budget);
    }

    @Override
    public void setNext(Discount next) {
        this.next = next;
    }
}
