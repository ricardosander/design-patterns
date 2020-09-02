package io.github.ricardosander.strategy.tax_calculator;

import io.github.ricardosander.strategy.tax_calculator.taxes.ICCC;
import io.github.ricardosander.strategy.tax_calculator.taxes.ICMS;
import io.github.ricardosander.strategy.tax_calculator.taxes.ISS;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TaxCalculatorTest {

    @Test
    public void computesICMS() {

        double budgetValue = 100.0;
        Budget budget = new Budget(budgetValue);

        double taxValue = new TaxCalculator().computes(new ICMS(), budget);

        double expectedTaxValue = 55.0;
        assertEquals(expectedTaxValue, taxValue, 0.001);
    }

    @Test
    public void computesISS() {

        double budgetValue = 100.0;
        Budget budget = new Budget(budgetValue);

        double taxValue = new TaxCalculator().computes(new ISS(), budget);

        double expectedValue = 6.0;
        assertEquals(expectedValue, taxValue, 0.001);
    }

    @Test
    public void computesICCCUnderThousand() {

        double budgetValue = 100.0;
        Budget budget = new Budget(budgetValue);

        double taxValue = new TaxCalculator().computes(new ICCC(), budget);

        double expectedValue = 5.0;
        assertEquals(expectedValue, taxValue, 0.001);
    }

    @Test
    public void computesICCCThousand() {

        double budgetValue = 1000.0;
        Budget budget = new Budget(budgetValue);

        double taxValue = new TaxCalculator().computes(new ICCC(), budget);

        double expectedValue = 70.0;
        assertEquals(expectedValue, taxValue, 0.001);
    }

    @Test
    public void computesICCCUnderThreeThousand() {

        double budgetValue = 2000.0;
        Budget budget = new Budget(budgetValue);

        double taxValue = new TaxCalculator().computes(new ICCC(), budget);

        double expectedValue = 140.0;
        assertEquals(expectedValue, taxValue, 0.001);
    }

    @Test
    public void computesICCCThreeThousand() {

        double budgetValue = 3000.0;
        Budget budget = new Budget(budgetValue);

        double taxValue = new TaxCalculator().computes(new ICCC(), budget);

        double expectedValue = 210.0;
        assertEquals(expectedValue, taxValue, 0.001);
    }

    @Test
    public void computesICCCAboveThreeThousand() {

        double budgetValue = 4000.0;
        Budget budget = new Budget(budgetValue);

        double taxValue = new TaxCalculator().computes(new ICCC(), budget);

        double expectedValue = 350.0;
        assertEquals(expectedValue, taxValue, 0.001);
    }

}