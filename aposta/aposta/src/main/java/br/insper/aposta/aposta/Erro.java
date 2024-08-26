package br.insper.aposta.aposta;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Erro {
    private String mensagem;
    private LocalDateTime data;
    private Integer codigo;
}
