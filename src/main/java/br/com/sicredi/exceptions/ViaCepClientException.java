package br.com.sicredi.exceptions;

import java.io.Serial;

public class ViaCepClientException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = 1L;

    public ViaCepClientException(String msg) {
        super(msg);
    }
}
