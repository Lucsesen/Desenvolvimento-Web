package br.iff.edu.exception;

import org.springframework.http.HttpStatus;

public class ExceptionInfo {

    HttpStatus statusCode;
    String mensagem;

    String dica;

    public ExceptionInfo(HttpStatus statusCode, String mensagem, String dica) {
        this.statusCode = statusCode;
        this.mensagem = mensagem;
        this.dica = dica;
    }

    public HttpStatus getStatusCode() {
        return statusCode;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getDica() {
        return dica;
    }
}
