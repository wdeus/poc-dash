package br.gov.sp.cps.api.poc.dash.core.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "dim_entrevista")
public class Entrevista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEntrevista;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtEntrevista;

    @Column(nullable = false)
    private String entrevistador;

    @Column(nullable = false)
    private String resultado;

}
