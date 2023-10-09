package com.funtec.systemhospital.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Use GenerationType.IDENTITY para autoincremento em Postgres
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "idade")
    private int idade;

    @Column(name = "cpf", unique = true)
    @NotNull
    private String cpf;

    @Column(name = "convenio")
    private boolean convenio;

    @Column(name = "sexo")
    private String sexo;

    @OneToOne(mappedBy = "paciente", cascade = CascadeType.ALL)
    @JoinColumn(name = "paciente_id")
    private Leito leito;
}
