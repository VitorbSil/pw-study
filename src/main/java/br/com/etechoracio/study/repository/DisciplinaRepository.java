package br.com.etechoracio.study.repository;

import br.com.etechoracio.study.entity.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Long>
{
    Disciplina findByNome(String nome);
}