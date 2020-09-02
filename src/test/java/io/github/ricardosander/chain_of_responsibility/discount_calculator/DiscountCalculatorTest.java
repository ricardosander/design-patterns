package io.github.ricardosander.chain_of_responsibility.discount_calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DiscountCalculatorTest {

    private static final double DELTA = 0.00001;

    @Test
    public void computeNoDiscount() {

        Budget budget = new Budget(100);
        budget.add("CASE");
        budget.add("PENCIL");
        budget.add("NOTEBOOK");
        budget.add("ERASER");
        budget.add("BOOK");

        double discount = new DiscountCalculator().computeDiscount(budget);

        double expectedDiscount = 0.0;

        assertEquals(expectedDiscount, discount, DELTA);
    }

    @Test
    public void computeMultipleItemsDiscount() {

        Budget budget = new Budget(600);
        budget.add("PEN");
        budget.add("PENCIL");
        budget.add("NOTEBOOK");
        budget.add("ERASER");
        budget.add("BOOK");
        budget.add("CASE");

        double discount = new DiscountCalculator().computeDiscount(budget);

        double expectedDiscount = 60.0;

        assertEquals(expectedDiscount, discount, DELTA);
    }

    @Test
    public void computeHighPriceDiscount() {

        Budget budget = new Budget(600);
        budget.add("PEN");
        budget.add("PENCIL");
        budget.add("NOTEBOOK");
        budget.add("ERASER");
        budget.add("BOOK");

        double discount = new DiscountCalculator().computeDiscount(budget);

        double expectedDiscount = 42.0;

        assertEquals(expectedDiscount, discount, DELTA);
    }

    @Test
    public void computeComboDiscount() {

        Budget budget = new Budget(100);
        budget.add("PEN");
        budget.add("PENCIL");
        budget.add("NOTEBOOK");
        budget.add("ERASER");
        budget.add("BOOK");

        double discount = new DiscountCalculator().computeDiscount(budget);

        double expectedDiscount = 5.0;

        assertEquals(expectedDiscount, discount, DELTA);
    }
}