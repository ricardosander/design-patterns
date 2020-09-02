package io.github.ricardosander.chain_of_responsibility;

import io.github.ricardosander.chain_of_responsibility.discounts.HighPrice;
import io.github.ricardosander.chain_of_responsibility.discounts.MultipleItems;
import io.github.ricardosander.chain_of_responsibility.discounts.NoDiscount;

public class DiscountCalculator {

    public double computeDiscount(Budget budget) {

        MultipleItems multipleItems = new MultipleItems();
        HighPrice highPrice = new HighPrice();
        NoDiscount noDiscount = new NoDiscount();

        multipleItems.setNext(highPrice);
        highPrice.setNext(noDiscount);

        return multipleItems.apply(budget);
    }

}
