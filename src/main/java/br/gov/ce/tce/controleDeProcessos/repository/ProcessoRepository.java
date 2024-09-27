package br.gov.ce.tce.controleDeProcessos.repository;

import br.gov.ce.tce.controleDeProcessos.model.Processo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface ProcessoRepository extends JpaRepository<Processo, String> {
    List<Processo> findByIdProcesso(String idProcesso);
}
