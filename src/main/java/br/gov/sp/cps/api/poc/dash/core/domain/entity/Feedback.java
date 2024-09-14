package br.gov.sp.cps.api.poc.dash.core.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "dim_feedback")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFeedback;

    @Column(nullable = false)
    private String descricao;
}
