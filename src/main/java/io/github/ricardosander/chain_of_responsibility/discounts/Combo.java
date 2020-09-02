package io.github.ricardosander.chain_of_responsibility.discounts;

import io.github.ricardosander.chain_of_responsibility.Budget;
import io.github.ricardosander.chain_of_responsibility.Discount;

public class Combo implements Discount {

    private Discount next;

    @Override
    public double apply(Budget budget) {

        boolean pencilPresent = budget.getItems().stream().anyMatch("PENCIL"::equalsIgnoreCase);
        boolean penPresent = budget.getItems().stream().anyMatch("PEN"::equalsIgnoreCase);

        if (pencilPresent && penPresent) {
            return budget.getValue() * 0.05;
        }
        return next.apply(budget);
    }

    @Override
    public void setNext(Discount next) {
        this.next = next;
    }
}
