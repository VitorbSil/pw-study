package br.com.etechoracio.study.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "TBL_REL_TUTOR_DISPONIBILIDADE")
public class TutorDisponibilidade
{
    @Id
    @ManyToMany
    @JoinColumn(name = "ID_MONITOR")
    private Monitor idMonitor;

    @ManyToMany
    @JoinColumn(name = "ID_DISPONIBILIDADE")
    private Disponibilidade idDisponibilidade;
}