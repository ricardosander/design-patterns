package io.github.ricardosander.strategy.investment_calculator;

import io.github.ricardosander.strategy.investment_calculator.investments.Aggressive;
import io.github.ricardosander.strategy.investment_calculator.investments.Conservative;
import io.github.ricardosander.strategy.investment_calculator.investments.Moderate;

import static org.junit.Assert.*;

import org.junit.Test;

public class InvestmentMakerTest {

    @Test
    public void testConservativeInvestment() {

        double initialBalance = 100.0;
        BankAccount account = new BankAccount(initialBalance);
        Investment investment = new Conservative();

        new InvestmentMaker().computeInvestment(investment, account);

        double expectedBalance = 108;

        assertEquals(expectedBalance, account.getBalance(), 0.001);
    }

    @Test
    public void testModerateInvestment() {

        double initialBalance = 100.0;
        BankAccount account = new BankAccount(initialBalance);
        Investment investment = new Moderate();

        new InvestmentMaker().computeInvestment(investment, account);

        double betterExpectedBalance = 107;
        double worstExpectedBalance = 102.5;

        assertTrue(account.getBalance() == betterExpectedBalance || account.getBalance() == worstExpectedBalance);
    }

    @Test
    public void testAggressiveInvestment() {

        double initialBalance = 100.0;
        BankAccount account = new BankAccount(initialBalance);
        Investment investment = new Aggressive();

        new InvestmentMaker().computeInvestment(investment, account);

        double betterExpectedBalance = 105;
        double worstExpectedBalance = 100.6;

        assertTrue(account.getBalance() == betterExpectedBalance || account.getBalance() == worstExpectedBalance);
    }
}