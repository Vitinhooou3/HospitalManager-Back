package com.funtec.systemhospital.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "leito")
public class Leito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Usar GenerationType.IDENTITY para autoincremento em Postgres
    private Long id;

    private boolean disponivel;

    // Chaves estrangeiras

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_id_paciente", referencedColumnName = "id",unique = true)
    private Paciente paciente;

    @Column(name = "fk_id_paciente", insertable = false, updatable = false)
    private Long id_paciente;


    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_id_medico", referencedColumnName = "id", unique = true)
    private Medico medico;

    @Column(name = "fk_id_medico", insertable = false, updatable = false)
    private Long id_Medico;
}
