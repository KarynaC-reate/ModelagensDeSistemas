package br.com.edukacode.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lead")

public class LeadController {

// Métodos para gerenciar leads

    @PostMapping
    public String criarLead(@RequestBody DadosCadastroLead dados){
        System.out.println("Lead criado com os dados:" +dados);
        return "Lead criado com sucesso! 👾";
    }

    @GetMapping
    public void listarLead(){
        
    }

    @PutMapping
    public void atualizarLead(){
        
    }
    @DeleteMapping
    public void excluirLead(){
        
    }
    
}

