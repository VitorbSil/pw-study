package br.com.etechoracio.study.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;

import java.util.List;

//1 monitor pode ter 1 disciplina, 1 discplina em n monitores
@Entity
@Table(name = "TBL_MONITOR")
@Getter
@Setter
public class Monitor
{
    @Id
    @Column(name = "ID_MONITOR")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TX_NOME")
    private String nome;

    @Column(name = "TX_FOTO")
    private String foto;

    @Column(name = "TX_WHATSAPP")
    private String whatsapp;

    @Column(name = "TX_EMAIL")
    private String email;

    @Column(name = "TX_CONTEUDO")
    private String conteudo;

    @ManyToOne
    @JoinColumn(name = "ID_DISCIPLINA")
    private Disciplina disciplina;

    @ManyToMany
    @JoinTable(name = "TBL_REL_MONITOR_DISPONIBILIDADE",
    joinColumns = @JoinColumn(name = "ID_MONITOR"),
    inverseJoinColumns = @JoinColumn(name = "ID_DISPONIBILIDADE"))
    private List<Disponibilidade> disponibilidades;



}
