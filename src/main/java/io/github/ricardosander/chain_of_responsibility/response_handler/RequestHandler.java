package io.github.ricardosander.chain_of_responsibility.response_handler;

import io.github.ricardosander.chain_of_responsibility.response_handler.responses.CSVHandler;
import io.github.ricardosander.chain_of_responsibility.response_handler.responses.PercentageHandler;
import io.github.ricardosander.chain_of_responsibility.response_handler.responses.ToStringHandler;
import io.github.ricardosander.chain_of_responsibility.response_handler.responses.XMLHandler;

public class RequestHandler {

    public String handle(Request request, BankAccount account) {

        XMLHandler xmlHandler = new XMLHandler();
        CSVHandler csvHandler = new CSVHandler();
        PercentageHandler percentageHandler = new PercentageHandler();
        ToStringHandler toStringHandler = new ToStringHandler();

        xmlHandler.setNext(csvHandler);
        csvHandler.setNext(percentageHandler);
        percentageHandler.setNext(toStringHandler);


        return xmlHandler.handles(request, account);
    }
}
