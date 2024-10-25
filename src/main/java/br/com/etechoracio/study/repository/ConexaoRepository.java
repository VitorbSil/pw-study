package br.com.etechoracio.study.repository;

import br.com.etechoracio.study.entity.Conexao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConexaoRepository extends JpaRepository<Conexao, Long> {
}
