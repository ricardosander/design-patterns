package io.github.ricardosander.chain_of_responsibility.response_handler.responses;

import io.github.ricardosander.chain_of_responsibility.response_handler.BankAccount;
import io.github.ricardosander.chain_of_responsibility.response_handler.Request;
import io.github.ricardosander.chain_of_responsibility.response_handler.Response;

public class ToStringHandler implements Response {

    @Override
    public String handles(Request request, BankAccount account) {
        return account.toString();
    }

    @Override
    public void setNext(Response next) {

    }
}
