package io.github.ricardosander.chain_of_responsibility.response_handler;

public class Request {

    private final Formant formant;

    public Request(Formant formant) {
        this.formant = formant;
    }

    public Formant getFormant() {
        return formant;
    }
}
