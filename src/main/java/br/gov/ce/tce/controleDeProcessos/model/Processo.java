package br.gov.ce.tce.controleDeProcessos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "controle_de_processos_debito_e_multa")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Processo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id_processo", nullable = false)
    private String idProcesso;

    @Column(nullable = false)
    private String especie;

    @Column(name = "ente_federativo", nullable = false)
    private String enteFederativo;

    @Column(name = "responsável", nullable = false)
    private String responsavel;

    @Column(name = "cpf", nullable = false)
    private String cpf;

    @Column(name = "tipo", nullable = false)
    private String tipo;

    @Column(name = "valor", nullable = false)
    private String valor;
}
