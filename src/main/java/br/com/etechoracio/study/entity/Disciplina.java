package br.com.etechoracio.study.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbl_disciplina")
public class Disciplina {
    @Id
    @Column(name = "id_disciplina")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TX_NOME")
    private String nome;
}