package com.funtec.systemhospital.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "medico")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Use GenerationType.IDENTITY para autoincremento em Postgres
    private Long id;

    @Column(name = "nome")
    private String nome;

    @ManyToOne()
    @JoinColumn(name = "leito_id")
    private Leito leito;

    @Column(name = "fk_id_leito", insertable = false, updatable = false)
    private Long id_leito;


    @Column(name = "especialidade")
    private String especialidade;

}
