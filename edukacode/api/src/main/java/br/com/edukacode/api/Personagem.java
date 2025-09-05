package br.com.edukacode.api;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="tbpersonagem")
@Entity(name="Personagem")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")

public class Personagem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 
    private String nome; 
    private String arquetipo; 
    private String historia; 
    private String personalidade; 
    private String motivacoes; 
    private String aparencia;

    public Personagem(DadosCadastroPersonagem dados) {
        this.nome = dados.nome();
        this.arquetipo = dados.arquetipo();
        this.historia = dados.historia();
        this.personalidade = dados.personalidade();
        this.motivacoes = dados.motivacoes();
        this.aparencia = dados.aparencia();
    }
}
