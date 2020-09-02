package io.github.ricardosander.chain_of_responsibility.response_handler;

public interface Response {
    String handles(Request request, BankAccount account);
    void setNext(Response next);
}
