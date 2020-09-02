package io.github.ricardosander.chain_of_responsibility.discount_calculator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Budget {

    private final double value;
    private final List<String> items;

    public Budget(double value) {
        this.value = value;
        items = new ArrayList<>();
    }

    public double getValue() {
        return value;
    }

    public void add(String item) {
        this.items.add(item);
    }

    public List<String> getItems() {
        return Collections.unmodifiableList(items);
    }
}
