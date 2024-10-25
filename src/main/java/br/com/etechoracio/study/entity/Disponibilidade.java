package br.com.etechoracio.study.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "TBL_DISPONIBILIDADE")
@Getter
@Setter
public class Disponibilidade
{
    @Id
    @Column(name = "ID_DISPONIBILIDADE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TX_DIA_SEMANA")
    @Enumerated(EnumType.STRING)
    private DiaDaSemanaEnum diaSemana;

    @Column(name = "DT_DAS")
    private LocalDateTime das;

    @Column(name = "DT_ATE")
    private LocalDateTime ate;

}