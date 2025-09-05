package br.com.edukacode.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/personagem")

public class PersonagemController {
    @Autowired  //injeção de dependência
    private PersonagemRepository repository;

    @PostMapping
    public String criarPersonagem(@RequestBody @Valid DadosCadastroPersonagem dados) {
        // Implementação do método para criar um personagem
        System.out.println("Personagem criado com os dados: " + dados);
        //null - persitence
        //sem null - merge
        repository.save(new Personagem(null,dados.nome(),dados.arquetipo(),dados.historia(),dados.personalidade(),dados.motivacoes(),dados.aparencia())); 
        return "Personagem criado com sucesso!";
    }

    @GetMapping
    public Page<DadosListagemPersonagem> listarPersonagens(@PageableDefault(size = 15, sort = {"nome"}) Pageable paginacao) {
        return repository.findAll(paginacao).map(DadosListagemPersonagem::new);
    }

    @PutMapping
    @Transactional
    public String atualizarLead(@RequestBody DadosAtualizacaoLead dados) {
        var personagem = repository.getReferenceById(dados.id());
        personagem.atualizarInformacoes(dados);
        return "Lead atualizado com sucesso!";
    }

    @DeleteMapping("/{id}")
    @Transactional
    public String excluirLead(@PathVariable Long id) {
        // Implementação do método para excluir um lead
        repository.deleteById(id);
        return "Lead excluído com sucesso!";
    }

}
