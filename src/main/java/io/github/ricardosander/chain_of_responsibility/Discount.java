package io.github.ricardosander.chain_of_responsibility;

public interface Discount {
    double apply(Budget budget);
    void setNext(Discount next);
}
