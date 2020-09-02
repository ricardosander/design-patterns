package io.github.ricardosander.chain_of_responsibility.response_handler;

import static org.junit.Assert.*;

import org.junit.Test;

public class RequestHandlerTest {

    @Test
    public void testHandleXML() {

        Request request = new Request(Formant.XML);
        BankAccount account = new BankAccount("test1", 100.0);

        RequestHandler requestHandler = new RequestHandler();

        String response = requestHandler.handle(request, account);

        String expected = "<account><client>" + account.getClient() + "</client><balance>" + account.getBalance() + "</balance></account>";
        assertEquals(expected, response);
    }

    @Test
    public void testHandleCSV() {

        Request request = new Request(Formant.CSV);
        BankAccount account = new BankAccount("test1", 100.0);

        RequestHandler requestHandler = new RequestHandler();

        String response = requestHandler.handle(request, account);

        String expected = account.getClient() + "," + account.getBalance();
        assertEquals(expected, response);
    }

    @Test
    public void testHandlePercentage() {

        Request request = new Request(Formant.PERCENTAGE);
        BankAccount account = new BankAccount("test1", 100.0);

        RequestHandler requestHandler = new RequestHandler();

        String response = requestHandler.handle(request, account);

        String expected = account.getClient() + "%" + account.getBalance();
        assertEquals(expected, response);
    }
}