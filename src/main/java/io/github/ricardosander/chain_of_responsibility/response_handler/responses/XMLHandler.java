package io.github.ricardosander.chain_of_responsibility.response_handler.responses;

import io.github.ricardosander.chain_of_responsibility.response_handler.BankAccount;
import io.github.ricardosander.chain_of_responsibility.response_handler.Formant;
import io.github.ricardosander.chain_of_responsibility.response_handler.Request;
import io.github.ricardosander.chain_of_responsibility.response_handler.Response;

public class XMLHandler implements Response {

    private Response next;

    @Override
    public String handles(Request request, BankAccount account) {
        if (request.getFormant() == Formant.XML) {
            return "<account><client>" + account.getClient() + "</client><balance>" + account.getBalance() + "</balance></account>";
        }
        return next.handles(request, account);
    }

    @Override
    public void setNext(Response next) {
        this.next = next;
    }
}
