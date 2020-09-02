package io.github.ricardosander.strategy.investment_calculator.investments;

import io.github.ricardosander.strategy.investment_calculator.BankAccount;
import io.github.ricardosander.strategy.investment_calculator.Investment;

import java.util.Random;

public class Aggressive implements Investment {

    private final Random random;

    public Aggressive() {
        random = new Random();
    }

    @Override
    public double invest(BankAccount account) {
        return won() ? account.getBalance() * 0.05 : account.getBalance() * 0.006;
    }

    private boolean won() {
        return random.nextDouble() > 0.5;
    }
}
