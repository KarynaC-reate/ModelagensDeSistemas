package br.com.edukacode.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/lead")

public class LeadController {
    @Autowired  //injeção de dependência
    private LeadRepository repository;
    @PostMapping
    public String criarLead(@RequestBody @Valid DadosCadastroLead dados) {
        // Implementação do método para criar um lead
        System.out.println("Lead criado com os dados: " + dados);
        //null - persitence
        //sem null - merge
        repository.save(new Lead(null,dados.nome(),dados.email(),dados.telefone(),dados.cpf())); 
        return "Lead criado com sucesso!";
    }

    // EXERCÍCIO DA PROVA
    @GetMapping
    public List<DadosListagemLead> listarLeads() {
        return repository.findAll().stream().map(DadosListagemLead::new).toList();
    
    }

    @PutMapping
    public void atualizarLead() {
        // Implementação do método para atualizar um lead existente
    }

    @DeleteMapping
    public void excluirLead() {
        // Implementação do método para excluir um lead
    }

}