package io.github.ricardosander.chain_of_responsibility.discount_calculator;

public interface Discount {
    double apply(Budget budget);
    void setNext(Discount next);
}
