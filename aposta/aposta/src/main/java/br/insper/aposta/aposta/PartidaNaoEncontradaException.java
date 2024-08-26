package br.insper.aposta.aposta;

public class PartidaNaoEncontradaException extends RuntimeException{
    public PartidaNaoEncontradaException(Integer id) {
        super("Partida não encontrada com o id: " + id);
    }
}
