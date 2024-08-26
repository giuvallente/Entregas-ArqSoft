package br.insper.aposta.aposta;

public class PartidaInvalidaException extends RuntimeException {

    public PartidaInvalidaException() {
        super("Aposta inválida, partida já ocorreu.");
    }
}
