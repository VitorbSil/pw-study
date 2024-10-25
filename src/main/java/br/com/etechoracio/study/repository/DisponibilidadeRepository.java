package br.com.etechoracio.study.repository;

import br.com.etechoracio.study.entity.Disponibilidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisponibilidadeRepository extends JpaRepository<Disponibilidade, Long> {
}
