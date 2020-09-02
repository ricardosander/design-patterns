package io.github.ricardosander.chain_of_responsibility.response_handler.responses;

import io.github.ricardosander.chain_of_responsibility.response_handler.BankAccount;
import io.github.ricardosander.chain_of_responsibility.response_handler.Formant;
import io.github.ricardosander.chain_of_responsibility.response_handler.Request;
import io.github.ricardosander.chain_of_responsibility.response_handler.Response;

public class CSVHandler implements Response {

    private Response next;

    @Override
    public String handles(Request request, BankAccount account) {
        if (request.getFormant() == Formant.CSV) {
            return account.getClient() + "," + account.getBalance();
        }
        return next.handles(request, account);
    }

    @Override
    public void setNext(Response next) {
        this.next = next;
    }
}
