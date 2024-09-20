package br.gov.ce.tce.controleDeProcessos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "controle_de_processos_debito_e_multa")
@Getter
@Setter
@AllArgsConstructor
public class Processo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_processo", nullable = false)
    private Long idProcesso;

    @Column(nullable = false)
    private String especie;

    @Column(name = "ente_federativo", nullable = false)
    private String enteFederativo;

    @Column(nullable = false)
    private String responsavel;

    @Column(length = 14, name = "CPF")
    private Long cpf;

    @Column(nullable = false)
    private String tipo;

    @Column(scale = 2, nullable = false)
    private double valor;
}
