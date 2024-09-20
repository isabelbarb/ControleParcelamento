package br.gov.ce.tce.controleDeProcessos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "controle_de_parcelamentos")
@Getter
@Setter
@AllArgsConstructor
public class Parcelamento implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "Processo Principal", nullable = false)
    private Long processoPrincipal;

    @Column(name = "Parcelas", nullable = false)
    private Integer numParcela;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Número do Processo", nullable = false)
    private Long idParcela;

    @Column(name = "Valor", scale = 2, nullable = false)
    private Double valor;

    @Column(name="Data", nullable = false)
    private LocalDate data;

    @Column(name = "Tipo", nullable = false)
    private String tipo;

    @Column(name = "Responsável", nullable = false)
    private String responsavel;



}
