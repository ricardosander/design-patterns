package io.github.ricardosander.chain_of_responsibility;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiscountCalculatorTest {

    private static final double DELTA = 0.00001;

    @Test
    public void computeNoDiscount() {

        Budget budget = new Budget(100);
        budget.add("Item 1");
        budget.add("Item 2");
        budget.add("Item 3");
        budget.add("Item 4");
        budget.add("Item 5");

        double discount = new DiscountCalculator().computeDiscount(budget);

        double expectedDiscount = 0.0;

        assertEquals(expectedDiscount, discount, DELTA);
    }

    @Test
    public void computeMultipleItemsDiscount() {

        Budget budget = new Budget(600);
        budget.add("Item 1");
        budget.add("Item 2");
        budget.add("Item 3");
        budget.add("Item 4");
        budget.add("Item 5");
        budget.add("Item 6");

        double discount = new DiscountCalculator().computeDiscount(budget);

        double expectedDiscount = 60.0;

        assertEquals(expectedDiscount, discount, DELTA);
    }

    @Test
    public void computeHighPriceDiscount() {

        Budget budget = new Budget(600);
        budget.add("Item 1");
        budget.add("Item 2");
        budget.add("Item 3");
        budget.add("Item 4");
        budget.add("Item 5");

        double discount = new DiscountCalculator().computeDiscount(budget);

        double expectedDiscount = 42.0;

        assertEquals(expectedDiscount, discount, DELTA);
    }
}