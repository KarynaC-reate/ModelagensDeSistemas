package br.com.edukacode.api;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoGenero(
    @NotNull
    Long id,
    String nome

) {
}
