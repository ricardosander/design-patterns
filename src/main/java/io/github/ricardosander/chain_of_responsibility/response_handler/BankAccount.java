package io.github.ricardosander.chain_of_responsibility.response_handler;

public class BankAccount {

    private final String client;
    private final double balance;

    public BankAccount(String client, double balance) {
        this.client = client;
        this.balance = balance;
    }

    public String getClient() {
        return client;
    }

    public double getBalance() {
        return balance;
    }
}
