package io.github.ricardosander.chain_of_responsibility.discount_calculator;

import io.github.ricardosander.chain_of_responsibility.discount_calculator.discounts.Combo;
import io.github.ricardosander.chain_of_responsibility.discount_calculator.discounts.HighPrice;
import io.github.ricardosander.chain_of_responsibility.discount_calculator.discounts.MultipleItems;
import io.github.ricardosander.chain_of_responsibility.discount_calculator.discounts.NoDiscount;

public class DiscountCalculator {

    public double computeDiscount(Budget budget) {

        MultipleItems multipleItems = new MultipleItems();
        HighPrice highPrice = new HighPrice();
        Combo combo = new Combo();
        NoDiscount noDiscount = new NoDiscount();

        multipleItems.setNext(highPrice);
        highPrice.setNext(combo);
        combo.setNext(noDiscount);

        return multipleItems.apply(budget);
    }

}
