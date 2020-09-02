package io.github.ricardosander.strategy.investment_calculator.investments;

import io.github.ricardosander.strategy.investment_calculator.BankAccount;
import io.github.ricardosander.strategy.investment_calculator.Investment;

public class Conservative implements Investment {

    @Override
    public double invest(BankAccount account) {
        return account.getBalance() * 0.08;
    }
}
