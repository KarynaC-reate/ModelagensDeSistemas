package br.com.edukacode.api;

public class Genero {

    private Long id;
    private String nome;

    //Construtor vazio
    public Genero() {
    }

    //Construtor
    public Genero(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    //Getter
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    //Setter
    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Genero{" +
               "id=" + id +
               ", nome='" + nome + '\'' +
               '}';
    }
}
    