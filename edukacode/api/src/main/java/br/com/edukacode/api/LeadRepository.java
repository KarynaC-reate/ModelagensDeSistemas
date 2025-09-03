package br.com.edukacode.api;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeadRepository extends JpaRepository<Lead,Long> {

    Page<DadosListagemLead> findAll(Pageable paginacao);
   //JpaRepository estão presentes na interface
}