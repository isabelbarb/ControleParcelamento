package br.gov.ce.tce.controleDeProcessos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "controle_de_parcelamentos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Parcelamento implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "processo_principal", nullable = false)
    private String processoPrincipal;

    @Column(name = "parcelas", nullable = false)
    private Integer numParcela;

    @Column(name = "numero_do_processo", nullable = false)
    private String processoParcela;

    @Column(name = "valor", nullable = false)
    private String valor;

    @Column(name= "data", nullable = false)
    private String data;

    @Column(name = "tipo", nullable = false)
    private String tipo;

    @Column(name = "responsável", nullable = false)
    private String responsavel;

    @Column(name = "cpf", nullable = false)
    private String cpf;



}
