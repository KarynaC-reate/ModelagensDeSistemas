package br.com.edukacode.api;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonagemRepository extends JpaRepository<Personagem,Long> {
   //JpaRepository estão presentes na interface
}
