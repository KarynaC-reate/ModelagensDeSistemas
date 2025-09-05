package br.com.edukacode.api;

public record DadosListagemPersonagem(Long id, String nome, String arquetipo, String historia, String personalidade,String motivacoes,String aparencia) {

    public DadosListagemPersonagem(Personagem personagem){
        this(personagem.getId(),personagem.getNome(),personagem.getArquetipo(),personagem.getHistoria(),personagem.getPersonalidade(),personagem.getMotivacoes(),personagem.getAparencia());
    }
}
