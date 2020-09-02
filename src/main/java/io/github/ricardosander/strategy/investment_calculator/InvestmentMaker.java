package io.github.ricardosander.strategy.investment_calculator;

public class InvestmentMaker {

    public void computeInvestment(Investment investment, BankAccount account) {
        double profit = investment.invest(account);
        account.deposit(profit);
    }

}
