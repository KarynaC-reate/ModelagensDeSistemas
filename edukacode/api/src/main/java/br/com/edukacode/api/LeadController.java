package br.com.edukacode.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lead")

public class LeadController {
    @Autowired // Injeção de dependência
    private LeadRepository repository;

// Métodos para gerenciar leads

    @PostMapping
    public String criarLead(@RequestBody DadosCadastroLead dados){
        System.out.println("Lead recebido:" +dados);
        repository.save(new Lead(null, dados.nome(),dados.email(),dados.telefone()));
        return "Lead criado com sucesso! ";
    }

    @GetMapping
    public String listarLead(@RequestParam int pagina, @RequestParam int tamanho){
        return "Listar leads - página: " + pagina + ", tamanho: " + tamanho;
        
    }

    @PutMapping
    public void atualizarLead(){
        
    }
    @DeleteMapping
    public void excluirLead(){
        
    }
   
}

