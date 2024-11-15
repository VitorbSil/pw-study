package br.com.etechoracio.study.repository;

import br.com.etechoracio.study.entity.Monitor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonitorRepository extends JpaRepository<Monitor, Long>
{
    Monitor findByEmail (String email);
    Monitor findByWhatsapp (String whatsapp);
}
